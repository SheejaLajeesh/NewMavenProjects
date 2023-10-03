package LearnTestNG;

import org.testng.annotations.Test;

public class AttributesPriority {

	@Test(priority = 1)
	public void Signup(){
		
		System.out.println("Sign Up");
	}
	@Test(priority = 2)
	public void login() {
		
		System.out.println("Login");
	}
	@Test(priority = 3)
	public void SearchProduct() {
		
		System.out.println("SearchProduct");
	}
	@Test(priority = 4)
	public void addToCart() {
		
		System.out.println("addToCart");
				
	}
	@Test(priority = 5)
	public void Signout() {
		System.out.println("Signout");
	}
}
