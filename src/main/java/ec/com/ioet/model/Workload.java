package ec.com.ioet.model;

public class Workload {

	private String day;

	private String startTime;

	private String stopTime;

	public Workload() {

	}

	public Workload(String day, String startTime, String stopTime) {
		super();
		this.day = day;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
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
