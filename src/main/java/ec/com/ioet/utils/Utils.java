package ec.com.ioet.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ec.com.ioet.constants.Constants;
import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.model.Workload;

public class Utils {

	public static Workload parse(String inputData) 
	{
		Workload workload = new Workload();
		try {
			String[] resultDay = inputData.split("(?<=\\G..)");
			String[] resultEntryHours = inputData.split("[A-Z]{2}");
			String[] resultHours = resultEntryHours[1].split("-");
			List<Workload> workLoadList=new ArrayList<Workload>();
			workload.setDay(resultDay[0]);
			workload.setStartTime(resultHours[0]);
			workload.setStopTime(resultHours[1]);
			workLoadList.add(workload);
			return workload;
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}		
		return workload;
	}

	
	public static void printArr(String [] arr) {
		for(String aux:arr) {
			System.out.println(aux+" ");;
		}
	}
	
	public static WorkInfo parseMultipleInput(String input) {
		WorkInfo workInfo = new WorkInfo();
		List<Workload> listWorkLoad=new ArrayList<Workload>();
		String[] resultName = input.split("=");
		String[] resultWorkDay = resultName[1].split(",");
		for(int i=0; i<resultWorkDay.length; i++) {
			listWorkLoad.add(parse(resultWorkDay[i]));
		}
		workInfo.setName(resultName[0]);
		workInfo.setWorkload(listWorkLoad);
		return workInfo;
	}
	
	public static int calculateHours(String txtLowerTime, String txtGreaterTime) {
		String [] lowerResult = txtLowerTime.split(":");
		int lowerHour = Integer.parseInt(lowerResult[0]);
		int lowerMinutes = Integer.parseInt(lowerResult[1]);
		
		String [] greaterResult = txtGreaterTime.split(":");
		int greaterHour = Integer.parseInt(greaterResult[0]);
		int greaterMinutes = Integer.parseInt(greaterResult[1]);
		
		return (greaterHour - lowerHour);
	}
	
	private static long formatDateTime(String input ) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		return format.parse(input).getTime(); 
	}
	
	public static String chooseTimeLine(String txtLoweTime,String txtGreaterTime) {
		try {
			long lowerTime = formatDateTime(txtLoweTime);
			long greaterTime = formatDateTime(txtGreaterTime);
			long zero = formatDateTime(Constants.STARTING_ZERO);
			long zeroPlusOne = formatDateTime(Constants.ZERO_PLUS_ONE);
			long nine = formatDateTime(Constants.STARTING_NINE);
			long ninePlusOne = formatDateTime(Constants.NINE_PLUS_ONE);
			long eighteen = formatDateTime(Constants.STARTING_EIGHTEEN);
			long eighteenPlusOne = formatDateTime(Constants.EIGHTEEN_PLUS_ONE);
			
			if(zeroPlusOne < lowerTime && lowerTime < nine ) {
				return "Franja 1";
			}else if(ninePlusOne < lowerTime && lowerTime < eighteen) {
				return "Franja 2";
			}else if(eighteenPlusOne < lowerTime && lowerTime < zero) {
				return "Franja 3";
			}else {
				return "ningun caso";
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
