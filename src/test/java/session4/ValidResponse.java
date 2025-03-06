package session4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ValidResponse {
	
	@Test
	public void getSingleUser() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification requestspec = RestAssured.given();
		Response response = requestspec.get();
		int Statuscode = response.getStatusCode();
		
		//Assert.assertEquals(Statuscode/*Status code*/, 200/*Expected status code*/,"Incorrect status code receeived");
		//String statusLine = repsonse.getStatusLine();
		//Assert.assertEquals(statusLine, "Http/1.1 200 OK", "Incorrect status line recevied");
		
		
		
		ValidatableResponse validateres = response.then();
		
		
		validateres.statusCode(200);
		System.out.println("validated1");
		validateres.statusLine("HTTP/1.1 200 OK");
		System.out.println("validated2");
	}

}
