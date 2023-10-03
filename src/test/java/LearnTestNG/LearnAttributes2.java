package LearnTestNG;

import org.testng.annotations.Test;

public class LearnAttributes2 {

	public class LearnAttributes {
		@Test
		public void Signup(){
			
			System.out.println("Sign Up");
		}
		@Test(dependsOnMethods = "Signup",priority = 1)
		public void login() {
			
			System.out.println("Login");
		}
		@Test(dependsOnMethods = "login")
		public void SearchProduct() {
			
			System.out.println("SearchProduct");
		}
		@Test(dependsOnMethods = "SearchProduct")
		public void addToCart() {
			
			System.out.println("addToCart");
			//throw new RuntimeException();
					
		}
		@Test(dependsOnMethods = "addToCart")
		public void Signout() {
			System.out.println("Signout");
		}
	}
}
