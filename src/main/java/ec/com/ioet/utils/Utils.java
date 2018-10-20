package ec.com.ioet.utils;

public class Utils {

	public static String[] parse(String inputData) 
	{
		try {
			String[] resultName = inputData.split("=");
			String[] resultDay = resultName[1].split("(?<=\\G..)");
			String[] resultEntryHours = resultName[1].split("[A-Z]{2}");
			String[] resultHours = resultEntryHours[1].split("-");
			String[] result = new String[4];
			result[0]=resultName[0];
			result[1]=resultDay[0];
			result[2]=resultHours[0];
			result[3]=resultHours[1];
			return result;
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}		
		return new String[0];
	}

	
	public static void printArr(String [] arr) {
		for(String aux:arr) {
			System.out.println(aux+" ");;
		}
	}
}
