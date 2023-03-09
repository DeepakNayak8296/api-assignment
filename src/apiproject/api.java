package apiproject;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import body.payload;


public class api {
	
	@Test
	public void register() {
		// TODO Auto-generated method stub

		
	RestAssured.baseURI= "https://reqres.in/api/";	
	String response = given().log().all().header("content-type", "application/json")
			.body(payload.register())
			.when().post("/register")
			.then().assertThat().statusCode(400)        //log().all().
			.header("Server", "cloudflare").extract().response().asString();
	
	System.out.println(response);
	
	
	
	}
	

}
