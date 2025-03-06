package session3;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestPutMethod {

	 @Test
	 public void test04() {
		 JSONObject jsonobject = new JSONObject();		 
		 jsonobject.put("name", "farhan");
		 jsonobject.put("Job", "searching");
		 RestAssured.baseURI = "https://reqres.in/api/users/806";
		 RestAssured.given().header("Content-type","application/json")
		 .contentType(ContentType.JSON)
		 .body(jsonobject.toJSONString())
		 .when().put()
		 .then().statusCode(200).log().all();
	 }
}
