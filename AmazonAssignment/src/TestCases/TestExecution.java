package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.test.HomePage;
import com.test.ProductListPage;

public class TestExecution {
	// Execute all methods
	public static void main(String[] args) {
	
		TestCases testCases = new TestCases();
		testCases.TestPrintListOfProducts();
		testCases.ValidateListOfProducts();
		testCases.clickonProducts();
		
		System.out.println("Everthing is working successfully");	
		
    }

}
