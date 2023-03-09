package apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import body.payload;


public class login {
	
	@Test
	public void loginuser() {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "https://reqres.in/api/";	
		String response =	given().log().all().header("content-type", "application/json")
				.body(payload.register())
				.when().post("/login")
				.then().assertThat().statusCode(400)
				.header("Server", "cloudflare").extract().response().asString();
				
				System.out.println(response);


	}

}
