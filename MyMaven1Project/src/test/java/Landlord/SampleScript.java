package Landlord;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.jayway.restassured.path.json.JsonPath;


public class SampleScript {
	@Test
 public void sample(){
	 given()
	 //.pathParm("countrycode","IND")
	 .queryParam("Text","Uttar Pradesh")
	 .formParam("username","jhon","password","Mathew")
	 .auth().basic("UN","PWD")
	 .when()
	 //.get("http://services.groupkt.com/state/get/{countrycode}/all")
	 .get("http://services.groupkt.com/state/search/IND?text=pradesh")
	 .then()
	 .statusCode(200)
	 .extract().response().prettyPrint();
 }
	

}
