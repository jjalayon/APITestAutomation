package com.test.automation.api.config;

import com.test.automation.api.stepdefinitions.BaseStepDefinition;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = BaseStepDefinition.class)
public class ConfigCucumberSpring {

}

