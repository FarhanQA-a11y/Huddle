package Authorization;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BearToken {
  
	@Test
	public void bearerToken() {
		RequestSpecification requestspec = RestAssured.given();
		requestspec.baseUri("https://gorest.co.in/");
		requestspec.basePath("/public/v2/users");
		JSONObject payload = new JSONObject();
		payload.put("name", "farhan");
		payload.put("gender", "male");
		payload.put("email", "farhan@yopmail.com");
		payload.put("status", "Active");
		
		String bear = "";
	}
	
}
