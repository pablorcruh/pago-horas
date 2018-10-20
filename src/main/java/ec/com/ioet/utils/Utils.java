package ec.com.ioet.utils;

import java.util.ArrayList;
import java.util.List;

import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.model.Workload;

public class Utils {

	public static WorkInfo parse(String inputData) 
	{
		WorkInfo workInfo = new WorkInfo();
		try {
			String[] resultName = inputData.split("=");
			String[] resultDay = resultName[1].split("(?<=\\G..)");
			String[] resultEntryHours = resultName[1].split("[A-Z]{2}");
			String[] resultHours = resultEntryHours[1].split("-");
			
			List<Workload> workLoadList=new ArrayList<Workload>();
			Workload workload = new Workload();
			
			workload.setDay(resultDay[0]);
			workload.setStartTime(resultHours[0]);
			workload.setStopTime(resultHours[1]);
			workInfo.setName(resultName[0]);
			workLoadList.add(workload);
			workInfo.setWorkload(workLoadList);
			return workInfo;
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}		
		return workInfo;
	}

	
	public static void printArr(String [] arr) {
		for(String aux:arr) {
			System.out.println(aux+" ");;
		}
	}
}
