package dataprivder;

import org.testng.annotations.Test;

public class JSJBs {
	
	@Test(dataProvider = "ReadData_Excell",dataProviderClass = Read_ex.class)
	private void launch( ) {
		
		System.out.println();
		
		//System.out.println(data[0]);

	//	System.out.println(data[1]);


	}

}
