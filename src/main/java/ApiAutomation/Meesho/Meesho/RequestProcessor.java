package ApiAutomation.Meesho.Meesho;

	
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONObject;

import java.util.Map;

public class RequestProcessor {

   

    public Response getResponse(String url, Map<String, Object> params) {
        Response response = RestAssured
                .given()
                .parameters(params)
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        return response;
    }
    
    public Response postResponse(String url, Map<String, Object> params) {
        Response response = RestAssured
                .given()
                .body(new JSONObject(params))
                .when()
                .post(url)
                .then()
                .extract()
                .response();
        return response;
    }
}