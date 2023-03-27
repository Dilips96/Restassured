
import io.restassured.RestAssured;
import java.lang.IllegalStateException;
import java.lang.IllegalStateException;
import static io.restassured.RestAssured.*;

public class RahulsGoogleApi {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="//https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").body("{\n"
				+ "&quot;location&quot;: {\n"
				+ "&quot;lat&quot;: -38.383494,\n"
				+ "&quot;lng&quot;: 33.427362\n"
				+ "},\n"
				+ "&quot;accuracy&quot;: 50,\n"
				+ "\n"
				+ "&quot;name&quot;: &quot;Frontline house&quot;,\n"
				+ "&quot;phone_number&quot;: &quot;(+91) 983 893 3937&quot;,\n"
				+ "&quot;address&quot;: &quot;29, side layout, cohen 09&quot;,\n"
				+ "&quot;types&quot;: [\n"
				+ "&quot;shoe park&quot;,\n"
				+ "&quot;shop&quot;\n"
				+ "],\n"
				+ "&quot;website&quot;: &quot;http://google.com&quot;,\n"
				+ "&quot;language&quot;: &quot;French-IN&quot;\n"
				+ "}").when().log().all().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
		
		
		
		

	}

}


//.log().all() this you can put at last once you can set the code


//https://rahulshettyacademy.com/maps/api/place/add/jsonkey =qaclick123




