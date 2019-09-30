package ApiAutomation.Meesho.Meesho;

import org.testng.Assert;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

public class ResponseValidationCreateUser {
	public static Response postResponse;
    public static Response getSingleUserResponse;	
    Gson gson = null;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	  public void validateCreateResponse(Response response, String name, String job){
	        this.postResponse = response;
	        gson = new Gson();
	        CreateUserResponsePojo getDetailsByPage = gson.fromJson(response.asString(), CreateUserResponsePojo.class);
	        
	        Assert.assertEquals(response.getStatusCode(), 201);
	       
	    }

}
