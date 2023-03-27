import io.restassured.RestAssured;
import java.lang.IllegalStateException;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args)
	{
		
		// validate if all api is working as expected or not	 
		
		
		// Rest assured works on 3 principle
		
		// given,--> given method will take all the details what you need to submit for an API
		//when --> Submit the API  --> resource and Http methods
		//then --> Validate the Response
		

		RestAssured.baseURI ="https://core-trackado.tech-active.com";
		given().log().all().queryParam("id", "9").when().get("/vacancy/eligo_faq")
		.then().log().all().assertThat().statusCode(200);
		
		//.log().all() this you can put at last once you can set the code 
		
		///vacancy/eligo_faq?id=9
		
		
		
		
		
		//https://core-trackado.tech-active.com/vacancy/eligo_faq?id=9
		
	}

}
