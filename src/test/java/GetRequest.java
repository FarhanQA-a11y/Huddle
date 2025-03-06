import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
    //https://reqres.in/api/users/2
	
	@Test 
	void testcase1() {
		Response res =  RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println("status code: "+res.getStatusCode());
		//System.out.println("status code: "+res.getHeader(null));
		 
	 }
}
