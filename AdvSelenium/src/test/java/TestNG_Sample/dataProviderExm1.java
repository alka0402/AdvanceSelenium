package TestNG_Sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExm1 {
	@Test(dataProvider = "getData")
	public void BookTicket(String src,String Dest,int count) {
		System.out.println("book my ticket from "+src+" to"+Dest+"no of people "+count+"");
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] objarr=new Object[3][3];
		objarr [0][0]="UP";
		objarr [0][1]="AP";
		objarr [0][2]=5;
		objarr [1][0]="j&K";
		objarr [1][1]="RJ";
		objarr [1][2]=10;
		objarr [2][0]="PJ";
		objarr [2][1]="Mp";
		objarr [2][2]=98;
		
		
		return objarr;
		
	}

}
