package com.test.automation.api.stepdefinitions;

import com.test.automation.api.response.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class APITestStepDefinition  extends BaseStepDefinition {

    @When("API is called {string}")
    public void apiIsCalled(String url) {
        httpHeaders.set("Accept", "*/*");
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        restTemplate = new RestTemplate();
        response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }

    @Then("Promotion Element with Name {string} has a description {string}")
    public void nameHasDescription(String name, String value) throws Exception {
        responseContainer = gson.fromJson(response.getBody(), ResponseContainer.class);
        boolean found = false;
        for (Promotions bussinessPromotions : responseContainer.getPromotions()) {
            if (bussinessPromotions.getName().equalsIgnoreCase(name)) {
                assertExpectedAndActualResponse(value, bussinessPromotions.getDescription());
                found = true;
            }
        }
        if (!found){
            throw new Exception("Unable to find response: " + name);
        }
    }

    @Then("Verify response body if it contains {string} with value of {string}")
    public void verifyResponseBodyIfItContainsWithValueOf(String field, String value) {
        responseContainer = gson.fromJson(response.getBody(), ResponseContainer.class);
        switch (field){
            case "Name":
                assertExpectedAndActualResponse(responseContainer.getName(), value);
                break;
            case "CanRelist":
                assertExpectedAndActualResponse(responseContainer.getCanRelist(), value);
                break;

        }
    }
}