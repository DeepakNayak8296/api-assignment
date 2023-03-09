package apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class update {
	
	@Test
	public void updatedata() {
		// TODO Auto-generated method stub

		RestAssured.baseURI= "https://reqres.in/api/";	
	String response =	given().log().all().pathParam("id","1").header("content-type", "application/json")
		.when().put("/users/{id}")
		.then().assertThat().statusCode(200)
		.header("Server", "cloudflare").extract().response().asString();
		
		System.out.println(response);

	}

}
