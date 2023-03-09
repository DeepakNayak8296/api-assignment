package apiproject;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class delete {
	
	@Test
	public void deletedata() {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "https://reqres.in/api/";	
	String response	=given().log().all().pathParam("id","3")
		.when().delete("/users/{id}")
		.then().assertThat().statusCode(204)
		.header("Server", "cloudflare").extract().response().asString();
		
		System.out.println(response);
		


	}

}
