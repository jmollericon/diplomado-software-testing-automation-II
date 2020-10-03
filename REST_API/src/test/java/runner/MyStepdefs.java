package runner;

import clientAPI.FactoryRequest;
import clientAPI.RequestInformation;
import clientAPI.ResponseInformation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.JsonHelper;
import org.json.JSONException;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static configuration.Configuration.*;

public class MyStepdefs {
    ResponseInformation response = new ResponseInformation();
    Map<String,String> variables= new HashMap<>();

    @Given("^I have authentication to todo\\.ly$")
    public void iHaveAuthenticationToTodoLy() {
    }

    @When("^I send POST request '(.*)' with json$")
    public void iSendPOSTRequestApiProjectsJsonWithJson(String url, String jsonBody) {
        RequestInformation request = new RequestInformation();
        request.setUrl(HOST+url);
        request.setBody(jsonBody);
        request.addHeaders(BASIC_AUTHENTICATION_HEADER,BASIC_AUTHENTICATION);
        String method = "POST";
        response= FactoryRequest.make(method.toLowerCase()).send(request);
    }

    @Then("^I expected the response code (\\d+)$")
    public void iExpectedTheResponseCode(int expectedResponseCode) {
        System.out.println("Response Code "+response.getResponseCode());
        Assert.assertEquals("ERROR !! the response code es incorrecto",expectedResponseCode,response.getResponseCode());
    }

    @And("^I expected the response body is equal$")
    public void iExpectedTheResponseBodyIsEqual(String expectedResponseBody) throws JSONException {
        System.out.println("Response Body "+this.replaceVariables(response.getResponseBody()));
        Assert.assertTrue("ERROR el response body es incorrecto", JsonHelper.areEqualJSON(this.replaceVariables(expectedResponseBody),response.getResponseBody()));
    }

    private String replaceVariables(String value){
        for (String key:this.variables.keySet()) {
            value = value.replace(key,this.variables.get(key));
        }
        return value;
    }
}
