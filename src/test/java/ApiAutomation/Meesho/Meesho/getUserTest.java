package ApiAutomation.Meesho.Meesho;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class getUserTest {
	
	 static Properties props = null;

	    @BeforeClass
	    public void setup() throws Exception {
	        InputStream ins = new FileInputStream(new File("/Users/ashu/eclipse-workspace/Meesho/Resource/url.properties"));
	        props = new Properties();
	        props.load(ins);
	    }

	    @DataProvider(name = "numberOfPage")
	    public Object[][] testdata() {
	        return new Object[][]{
	        	{"page", 1},              
                {"page",100}
	        };
	    }

	    @Test(testName = "getUserdetails", dataProvider = "numberOfPage", alwaysRun = true)
	    public void getUser(String page, int count) {
	        RequestProcessor requestProcessor = new RequestProcessor();
	        String url = props.getProperty("envURL") + props.getProperty("User");
	        System.out.println(url);
	        Map<String, Object> params = new HashMap<String, Object>();
	        params.put(page,count);
	        
	        Response response = requestProcessor.getResponse(url, params);
	        
	        System.out.print(response.asString());
	  //      ResponseValidationGetUser resVal = new ResponseValidationGetUser();
	        
	     //   resVal.getUserByPage(response, page);
	        

	    }

}
