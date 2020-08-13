package TestDifinication;

import Utils.TestUtils;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import org.junit.After;
import org.junit.Before;
import utils.ApiUtils;

/**
 * Created by obaskirt on 23-Jan-18.
 */
public class BaseTest {

    public Response res = null; //Response
    public JsonPath jp = null; //JsonPath

    //Instantiate a Helper Test Methods (testUtils) Object
    TestUtils testUtils = new TestUtils();

    @Before
    public void setup (){
        //Test Setup
        ApiUtils.setBaseURI(); //Setup Base URI
        ApiUtils.setBasePath("api"); //Setup Base Path
        ApiUtils.setContentType(ContentType.JSON); //Setup Content Type
    }

    @After
    public void afterTest (){
        //Reset Values
        ApiUtils.resetBaseURI();
        ApiUtils.resetBasePath();
    }

}
