package com.test.automation.api.stepdefinitions;

import com.google.gson.Gson;
import com.test.automation.api.response.Promotions;
import com.test.automation.api.response.ResponseContainer;
import org.junit.Assert;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseStepDefinition {

    public static HttpHeaders httpHeaders = new HttpHeaders();
    public ResponseEntity<String> response;
    public RestTemplate restTemplate;
    public ResponseContainer responseContainer;
    public Promotions Promotions;
    Gson gson = new Gson();


    public void assertExpectedAndActualResponse(String expectedResponse, String actualResponse){
        Assert.assertEquals(expectedResponse,actualResponse);
    }

    public List<String> getListOfString(String text){
        List<String> newListOfString = new ArrayList<>();

        for (String item: text.split(",")
        ){
            newListOfString.add(item.trim());
        }
        return newListOfString;
    }

}
