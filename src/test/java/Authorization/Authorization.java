package Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization {

	@Test
	public void basicAuth() {
         RequestSpecification requestspec = RestAssured.given();
         requestspec.baseUri("http://postman-echo.com");
 		requestspec.basePath("/basic-auth");
 		Response response = requestspec.auth().digest("postman", "password").get();
 		System.out.println("Digest res status: "+response.statusLine());
 		System.out.println("Digest res body: "+response.body().asString());
	}
}
