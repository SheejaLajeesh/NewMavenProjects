package LearnTestNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttributes3 {
	@Test(alwaysRun = true,enabled = false)
	public void Signup(){
		
		System.out.println("Sign Up");
	}
	@Test(description = "This is for Login")
	public void login() {
		
		System.out.println("Login");
		throw new NoSuchElementException();
	}
	@Test(dependsOnMethods = "LearnTesting.LearnAttributes3.login",alwaysRun = true)
	public void SearchProduct() {
		
		System.out.println("SearchProduct");
	}
}
