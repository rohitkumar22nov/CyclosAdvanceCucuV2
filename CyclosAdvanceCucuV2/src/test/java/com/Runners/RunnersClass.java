package com.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	

features="Features",
tags = {"@DataTable,@PayUser_ScenarioOutline,@PayUser_DataDrivenExternalSource"},
glue= {"StepDefinition"},
format= {"pretty", "html:Reports",
		"json:Reports/cucumber.json",
		"junit:Reports/cucumber.xml"
		}
)


public class RunnersClass {

}
