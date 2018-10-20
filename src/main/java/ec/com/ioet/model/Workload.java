package ec.com.ioet.model;

public class Workload {
	
	private String day;
	
	private String name;
	
	private String startTime;
	
	private String stopTime;
	
	public Workload() {
		
	}
	
	

	public Workload(String day, String name, String startTime, String stopTime) {
		super();
		this.day = day;
		this.name = name;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}



	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}
	
	

}
