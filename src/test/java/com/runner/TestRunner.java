package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.libglobal.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.stepdefinition", dryRun = false, plugin = {
		"pretty", "junit:target\\adactinhotel.xml", "html:target", "json:target\\adactin.json",
		"rerun:src\\test\\resources\\failed.txt" }, monochrome = true, stepNotifications = true, tags = { "" })
public class TestRunner extends BaseClass {

	@AfterClass
	public static void afterExecution() {
		Reporting.generateJVMReport(getProjectPath() + "\\target\\adactin.json");
	}

}