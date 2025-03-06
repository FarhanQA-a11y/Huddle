package session3;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestDeleteMethod {
	
	 @Test
	 public void test05() {
		
		 RestAssured.baseURI = "https://reqres.in/api/users/806";
		 RestAssured.given().when().delete().then().log().all().statusCode(204);
	 }

}
