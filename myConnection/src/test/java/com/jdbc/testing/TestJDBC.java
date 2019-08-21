package com.jdbc.testing;

import java.sql.Connection;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import myConnection.Fetch;
import myConnection.LoadDriver;
import myConnection.deletion;

public class TestJDBC extends deletion {
	LoadDriver driver = new LoadDriver();
	Fetch fetch = new Fetch();
	deletion delete = new deletion();
	Connection con;

	@BeforeSuite
	public void testLoadDriver() {
		con = driver.loadingDriver();
		Assert.assertNotNull(con, "Connection Failed");
		System.out.println("Connection Established");
	}

	@BeforeMethod
	public void printMessage() {
		System.out.println("****TestMethod****");
	}

	@Test
	public void testFetch() throws SQLException {

		boolean d = fetch.fetchData();
		Assert.assertEquals(true, d, "Test Failed");
		System.out.println("Fetch Test Case Passed");
	}
	@AfterMethod
	public void Message() throws SQLException {

		System.out.println("****Testing Done****");
	}
}
