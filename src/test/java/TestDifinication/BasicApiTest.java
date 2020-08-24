package TestDifinication;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.testng.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import utils.ApiUtils;

/**
 * Created by obaskirt on 22-Jan-18.
 */
public class BasicApiTest extends BaseTest{
//
//    @Test
//    public void T01_StatusCodeTest() {
//        //Verify the http response status returned. Check Status Code is 200?
//        res = ApiUtils.getResponsebyPath("/gen/clients");
//        jp = ApiUtils.getJsonPath(res);
//        testUtils.checkStatusIs200(res);
//        testUtils.GetBody(res);
//        
//    }
//
//    @Test
//    public void T02_GetClients() {
//        res = ApiUtils.getResponsebyPath("/gen/clients");
//        jp = ApiUtils.getJsonPath(res);
//        System.out.println(testUtils.getClients(jp));
//    }
//
//   @Test
//    public void T03_GetAndroidModelPackageOptions() {
//       res = ApiUtils.getResponsebyPath("/gen/clients/android");
//       jp = ApiUtils.getJsonPath(res);
//       System.out.println("Opt: " + jp.get("modelPackage.opt"));
//       System.out.println("Description: " + jp.get("modelPackage.description"));
//       System.out.println("Type: " + jp.get("modelPackage.type"));
//   }
   
   @SuppressWarnings("unchecked")
@Test
   public void T04_GetStatus() {
	   RestAssured.baseURI ="https://demo6906887.mockable.io";
	   RequestSpecification request = RestAssured.given();
	   
	   JSONObject requestParams = new JSONObject();
	   requestParams.put("email", "admin@test.com"); // Cast
	   requestParams.put("password", "test123");

	   request.body(requestParams.toJSONString());
	   Response response = request.post("/api/v1/accounts/signin");
	   
	   int statusCode = response.getStatusCode();
	   Assert.assertEquals(statusCode, 200);
	   String successCode = response.jsonPath().get("SuccessCode");
//	   Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	   System.out.println(successCode);
  }

}
