package assignment_5;



public class MonitoredData {
	private String startTime;
	private String endTime;
	private String activity;
	
	public MonitoredData(String startTime, String endTime, String activity) {
		this.startTime=startTime;
		this.endTime=endTime;
		this.activity=activity;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getDates() {
		return startTime.substring(0,10);
	}
	
	public int getDate() {
		return Integer.parseInt(startTime.substring(8,10));
	}
	
	
	

}
