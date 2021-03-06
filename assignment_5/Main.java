package assignment_5;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Operations o = new Operations();
		FileWriter fle = new FileWriter();
		o.task1("Activities.txt");
		fle.createTask_1(o);
		long s = o.task2();
		fle.createTask_2(s, o.getId());
		Map<String, Long> result = o.task3();
		fle.createTask_3(result, o.getId());
		Map<Integer, Map<String, Long>> result1 = o.task4();
		fle.createTask_4(result1, o.getId());
	}

}
