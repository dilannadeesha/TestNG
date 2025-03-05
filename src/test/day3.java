package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day3 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing any methord in the class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname,String key) {
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test methord in day 3 class");
	}
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test methord in day 3 class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after executing any methord in the class");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLoginCarLoan() {
		//appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("  I am no 1");
	}
	
	//@Test(timeOut=4000)methord ekak time out nikara thiyaganna meka yodai.
	
	@Test(dataProvider = "getData")
	public void MobilesigninCarLoan(String username,String password) {
		//appium
		System.out.println("Mobile sginin");
		System.out.println(username);
		System.out.println(password);
	}	
	@Test(enabled=false)
	public void MobilesignoutCarLoan() {
		//appium
		System.out.println("Mobile signout");
	}
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void LoginAPICarLoan() {
		//rest API autoation
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password - good credit history= row
		//2nd username password - no credit history
		//3rd fraudelent credit history
		Object[][]data = new Object[3][2];
		//1st det
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassord";
		//couloumns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassord";
		
		//3nd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassord";
		return data;
		
	}
	
	

}
