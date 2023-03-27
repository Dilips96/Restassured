import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Getapi2 {

	public static void main(String[] args) 
	{
		RestAssured.baseURI ="//http://192.168.29.146:35581";
		given().log().all().queryParam("id", "10").when().get("/vacancy/eligo_faq")
		.then().log().all().assertThat().statusCode(200);

	}

}




//


//http://192.168.29.146:35581/cw-api/v1/core/vacancy/?pending_vacancy=false&vac_interview=true&client_id=15259&page_num=1&page_size=6