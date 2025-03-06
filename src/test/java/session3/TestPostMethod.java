package session3;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestPostMethod {
    
	@Test
	public void test03() {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", "farhan");
		jsonobject.put("Job", "QA Engineer");
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().header("Content-type","application/json")
		.contentType(ContentType.JSON)
		.body(jsonobject.toJSONString())
		.when().post()
		.then().statusCode(201).log().all();
	}
}
