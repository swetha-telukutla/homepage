package Landlord;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;

public class LandLortdTest {
	@Test
	public void getLandLord(){
		
		given()
		
		.when()
		.get("http://localhost:8080/landlords")
		.body("",is(empty()))
		.extract().response().body().prettyPrint();
	}

	@Test(enabled = true)
	public void postLandLord() {
		LandLord land = new LandLord("Andre", "Math", true);
		String str = given().contentType(ContentType.JSON).body(LandLord)
				/*
				 * .body("{" + "\"firstName\": \"Andrew123\"," +
				 * "\"lastName\": \"Math\"" + "\"trusted\": 50," + "}")
				 */
				.when().post("http://localhost:8080/landlords").then().statusCode(201).extract().response().body()
				.prettyPrint();
		// .extract().response().body().prettyPrint("id");
		JsonPath path = new JsonPath(str);
		String ID = path.getString("ID");
		given().pathParam("id", ID).when().get("{id}").then().extract().response().body().prettyPrint();

	}

}
