package DataProviderUtility;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider(name = "login",indices = {0,1},parallel= true )
	public String[][] getdata() {
		
		String[][] data = new String[3][2];
		data[0][0] = "sheeja.haridas@shenll.com";
		data[0][1] = "She@23@147";
		data[1][0] = "sheeja.haridas@shenll.com";
		data[1][1] = "She@23@147";
		data[2][0] = "third data";
		data[2][1] = "She@23@147";
		return data;
	}	
}
