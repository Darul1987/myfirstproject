package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting {
	public static void generateJVMReport(String jsonFile) {
	File file =new File("C:\\Users\\Tawfiq\\eclipse-workspace\\Cucumber1\\target");
	Configuration configuration =new Configuration(file,"OMR Branch Automation Project");
	configuration.addClassifications("Browser","Chrome");
	configuration.addClassifications("browser version","144");
	configuration.addClassifications("OS", "WIN 11");
	configuration.addClassifications("Sprint","34");
	List<String>jsonFiles=new ArrayList<>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
	builder.generateReports();
	
	
	
	
	

}
}
