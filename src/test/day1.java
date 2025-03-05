package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");
	}
	
	@Test
	public void Demo() {
		System.out.println("hello");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("**I am the last no**");
	}
	
	@Test
	public void Secondclass() {
		System.out.println("Byee");
	}

}
