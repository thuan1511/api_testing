package Utils;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;


import java.util.ArrayList;

import org.testng.Assert;



/**
 * Created by obaskirt on 22-Jan-18.
 */
public class TestUtils {

    //Verify the http response status returned. Check Status Code is 200?
	public void checkStatusIs200 (Response res) {
		Assert.assertEquals(res.getStatusCode(), 201);
    }
	
	public void GetBody(Response res) {
		res.getBody().asString();
	}

    //Get Clients
    public ArrayList getClients (JsonPath jp) {
        ArrayList clientList = jp.get();
        return clientList;
    }
}
