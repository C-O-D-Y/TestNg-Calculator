package test.calculator.methods;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import calculator.methods.solution.Methods;
import calculator.solution.Input;

public class Testing {
	Methods method = new Methods();
	Input m;
	double[] h = { 8, 4, 1 };
	double result;

	@BeforeSuite
	public void MakeObjects() {

		System.out.println("Testing Input.java");
		Input.main(null);
		Assert.assertNotNull(h[2], "Test Failed");
		System.out.println("");
	}

	@BeforeMethod
	public void TestMethods() {
		System.out.println("****Testing Method**** ");
	}

	// In below method, method will be printed when test will fail
	@Test(priority = 0)
	public void TestAdd() {
		result = method.add(h, 3);
		Assert.assertEquals(result, 13.0, "Test Failed");
		System.out.println("Addition Test Passed");
	}

	@Test(priority = 1)
	public void TestDivide() {
		result = method.divide(h, 3);
		Assert.assertEquals(result, 2.0, "Test failed");
		System.out.println("Division Test Passed");

	}

	@Test(priority = 2)
	public void TestMultiply() {
		result = method.multiply(h, 3);
		Assert.assertEquals(result, 32.0, "Test Failed");
		System.out.println("Multiplication Test Passed");
	}

	@Test(priority = 3)
	public void TestSubstract() {
		result = method.substract(h, 3);
		Assert.assertEquals(result, 3.0, "Test Failed");
		System.out.println("Substraction Test Passed");
	}

	@AfterSuite
	public void Results() {
		System.out.println("Results");
	}
}
