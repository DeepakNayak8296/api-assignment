package apiproject;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class fetch {
	
	@Test
	public void fetchdata()  {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
	String response =	given().log().all().pathParam("id","1")
		.when().get("/users/{id}")
		.then().assertThat().statusCode(200)
		.header("Server", "cloudflare").extract().response().asString();
		
		System.out.println(response);
		}
	

}
