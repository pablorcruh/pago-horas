package ec.com.ioet.services;

import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.model.Workload;

public interface ParseService {

	public Workload parse(String inputData);
	
	public WorkInfo parseMultipleInput(String input);
	
	public int calculateHours(Workload workload);
	
	public int chooseTimeLine(Workload workload);
}
