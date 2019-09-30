package ApiAutomation.Meesho.Meesho;

import org.testng.Assert;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import ApiAutomation.Meesho.Meesho.UserByPageResponsePojo;;

public class ResponseValidationGetUser {

    Gson gson = null;
    public static Response response;

    public void getUserByPage(Response response, String page){
        this.response = response;
        System.out.print(response);
    //    gson = new Gson();
    //    UserByPageResponsePojo getDetailsByPage = gson.fromJson(response.asString(), UserByPageResponsePojo.class);
        Assert.assertEquals(response.getStatusCode(), 200);
      //  Assert.assertEquals(getDetailsByPage.getpage(),page);
        //all assertions will follow here
    }
}
