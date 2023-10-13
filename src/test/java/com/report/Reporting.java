package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.libglobal.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {

	public static void generateJVMReport(String jsonFile) {

		// mention report location
		File reportDirectory = new File(getProjectPath() + "\\target");

		// set Configuration
		Configuration configuration = new Configuration(reportDirectory, "AdactinHotelAutomation");

		// set Classifications
		configuration.addClassifications("platformName", "Windows");
		configuration.addClassifications("platformVersion", "11");
		configuration.addClassifications("buildNumber", "AD12.20");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
