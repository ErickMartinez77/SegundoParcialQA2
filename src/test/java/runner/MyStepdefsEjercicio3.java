package runner;

import factoryRequest.FactoryRequest;
import factoryRequest.RequestInformation;
import helpers.Configuration;
import helpers.JsonAssert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class MyStepdefsEjercicio3 {
    Response response;
    RequestInformation request = new RequestInformation();
    Map<String, String> data = new HashMap<>();

    @Given("i got access to todoly")
    public void iGotAccessToTodoly() {
    }

    @When("i send the GET request to url {}")
    public void iSendTheGETRequestToUrlHttpTodoLyApiAuthenticationTokenJson(String url) {
        String authBasic = "Basic "+ Base64.getEncoder().encodeToString((Configuration.user+":"+Configuration.pass).getBytes(StandardCharsets.UTF_8));
        request.setAuthType(Configuration.AUTH_BASIC);
        request.setAuthValue(authBasic);
        request.setUrl(replaceAllData(url));
        response = FactoryRequest.make("GET").send(request);
    }

    @And("i get a {} and save it inside {}")
    public void iGetATokenStringAndSaveItInsideTokenValue(String property, String varName) {
        data.put(varName, response.then().extract().path(property) + "");
    }

    @When("i send the DELETE request to url {}")
    public void iSendTheDELETERequestToUrlHttpTodoLyApiAuthenticationTokenJson(String url) {
        request.setAuthType(Configuration.TOKEN);
        request.setAuthValue(replaceAllData("TokenValue"));
        request.setUrl(replaceAllData(url));
        response = FactoryRequest.make("DELETE").send(request);
    }

    @Then("i expect a response body")
    public void iGetAResponseBody(String body){
        Assertions.assertTrue(JsonAssert.areEqualJson(replaceAllData(body), response.getBody().asString()),"ERROR");
    }


    private String replaceAllData(String value) {
        for (String key : data.keySet()) {
            value = value.replace(key, data.get(key));
        }
        return value;
    }


}
