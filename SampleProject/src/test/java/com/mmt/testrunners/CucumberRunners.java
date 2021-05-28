package com.mmt.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/mmt/features",
					glue = "com/mmt/stepdefinitions",
					monochrome = true)
public class CucumberRunners {

}
