package assignment_5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Operations {
	private ArrayList<MonitoredData> data;
	private int id = 0;

	public ArrayList<MonitoredData> getData() {
		return data;
	}

	public void setData(ArrayList<MonitoredData> data) {
		this.data = data;
	}

	public Operations() {
		data = new ArrayList<MonitoredData>();
	}

	public void task1(String path) {
		id++;
		try (Scanner scan = new Scanner(new File(path))) {
			while (scan.hasNext()) {
				String sir = scan.nextLine();
				String s[] = sir.split("		");
				data.add(new MonitoredData(s[0], s[1], s[2]));
			}
		} catch (IOException er) {
			System.out.println("ERROR!");
		}
	}

	public long task2() {
		id++;
		List<String> d = data.stream().map(monitoredData -> monitoredData.getDates()).collect(Collectors.toList());
		long cnt = d.stream().distinct().count();
		return cnt;
	}

	public Map<String, Long> task3() {
		id++;
		Map<String, Long> result = data.stream()
				.collect(Collectors.groupingBy(MonitoredData::getActivity, Collectors.counting()));
		return result;
	}

	public Map<Integer, Map<String, Long>> task4() {
		id++;
		Map<Integer, Map<String, Long>> result = data.stream().collect(Collectors.groupingBy(MonitoredData::getDate,
				Collectors.groupingBy(MonitoredData::getActivity, Collectors.counting())));
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
