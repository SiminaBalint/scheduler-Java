package assignment_5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


public class FileWriter {

	public void createTask_1(Operations o) {
		File file = new File("Task" + o.getId() + ".txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				PrintWriter printWriter = new PrintWriter(file);
				for(MonitoredData m : o.getData()) {
					printWriter.println(m.getStartTime()+"		"+"		"+m.getEndTime()+"		"+m.getActivity());
				}
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void createTask_2(long i,int id) {
		File file = new File("Task" +id + ".txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				PrintWriter printWriter = new PrintWriter(file);
				printWriter.println("The number of disctinct days that appear in the monitoring data is: "+i);
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void createTask_3(Map<String, Long> result, int id) {
		File file = new File("Task" +id + ".txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				PrintWriter printWriter = new PrintWriter(file);
				printWriter.println(result);
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createTask_4(Map<Integer, Map<String, Long>> result, int id) {
		File file = new File("Task" +id + ".txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				PrintWriter printWriter = new PrintWriter(file);
				printWriter.println(result);
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

