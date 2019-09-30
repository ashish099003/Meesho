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

public class CreateUsertest {
	static Properties props = null;

    @BeforeClass
    public void setup() throws Exception {
        InputStream ins = new FileInputStream(new File("/Users/ashu/eclipse-workspace/Meesho/Resource/url.properties"));
        props = new Properties();
        props.load(ins);
    }

    @DataProvider(name = "userCreate")
    public Object[][] testdata() {
        return new Object[][]{
                {"ashish1", "sdet"}                             
        };
    }

    @Test(testName = "createUser", dataProvider = "userCreate", alwaysRun = true)
    public void getUser(String name, String job) {
        RequestProcessor requestProcessor = new RequestProcessor();
        String url = props.getProperty("envURL") + props.getProperty("User");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put(name,job);
        System.out.print(url);
        Response response = requestProcessor.postResponse(url, params);
        
        System.out.print(response.asString());
        ResponseValidationCreateUser valcreat = new ResponseValidationCreateUser();
        valcreat.validateCreateResponse(response, name, job);

    }

}
