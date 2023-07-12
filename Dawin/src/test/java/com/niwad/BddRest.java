package com.niwad;

import org.junit.Test;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.PrettyPrint;
import io.restassured.RestAssured;
import tech.grasshopper.pdf.extent.processor.data.RestAssuredAdditionalDataProcessor;

public class BddRest {

	@Test	
public void getEmployees() {
	
		RestAssured.given()
		            .baseUri("http://localhost:3000")
		            
		            .when()
		            .get("/employees")
.prettyPrint();		

	}

}
