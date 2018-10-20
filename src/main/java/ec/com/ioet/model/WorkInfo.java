package ec.com.ioet.model;

import java.util.List;

public class WorkInfo {
	private String name;
	private List<Workload> workload;

	public WorkInfo() {
	}

	public WorkInfo(String name, List<Workload> workload) {
		super();
		this.name = name;
		this.workload = workload;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Workload> getWorkload() {
		return workload;
	}

	public void setWorkload(List<Workload> workload) {
		this.workload = workload;
	}

}