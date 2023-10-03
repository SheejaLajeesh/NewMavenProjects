package LearnTestNG;

import org.testng.annotations.Test;

public class LearnGroups {
	@Test(groups = {"Smoketest"})
	public void Signup(){
		
		System.out.println("Sign Up");
	}
	@Test(groups = {"Regression"})
	public void login() {
		
		System.out.println("Login");
	}
	@Test(groups = {"SanityTest"})
	public void SearchProduct() {
		
		System.out.println("SearchProduct");
	}
	@Test(groups = {"Smoketest"})
	public void addToCart() {
		
		System.out.println("addToCart");
				
	}
	@Test(groups = {"Regression"})
	public void Signout() {
		System.out.println("Signout");
	}
}
