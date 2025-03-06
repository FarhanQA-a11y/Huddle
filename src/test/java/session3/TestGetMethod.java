package session3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestGetMethod {
 //https://reqres.in/api/users?page=2
	@Test
	public void test01() {
		Response res_test =  get("https://reqres.in/api/users?page=2");
		System.out.println(res_test.getBody().asString());
		System.out.println("status code: "+res_test.getStatusCode());
		System.out.println("Get Time: "+res_test.getTime());
		System.out.println("Header: "+res_test.getHeader("Content-Type"));
		
		//validate the status code
		//Expected status code =200
		
		int actual_status_code = res_test.getStatusCode();
		int expected_status_code = 200;
		Assert.assertEquals(expected_status_code, actual_status_code);
	}
	
	//BDD method
	@Test
	public void test02() {
		baseURI = "https://reqres.in/api/users";
		given().queryParam("page", "2").when().get().then().statusCode(200);
		
	}
}
