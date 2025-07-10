package Generic_Utilies;

import java.util.Random;

public class java_utilities {
	/**
	 * 
	 * @return
	 */
	public int getRandomNum() {
		
		Random ran=new Random();
		int rannum = ran.nextInt(1000);
		return rannum;
		
	}

}
