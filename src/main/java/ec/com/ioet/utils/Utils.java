package ec.com.ioet.utils;

import java.util.ArrayList;
import java.util.List;

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
}
