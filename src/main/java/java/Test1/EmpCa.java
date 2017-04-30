package Test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class employee {
	String name;
	boolean isStart;
	Integer time;
}

public class EmpCa {
	public void readFile() {
		String srcFile = "/Users/shine/Documents/Java/JavaFileReader.txt";
		String[] fileValue = new String[4];
		employee[] calander = new employee[20];
		int i = 0;
		try {
			String str = "";
			BufferedReader br = new BufferedReader(new FileReader(srcFile));
			while ((str = br.readLine()) != null) {
				fileValue = str.split("\\s+");
				employee emp = new employee();
				emp.name = fileValue[0];
				emp.isStart = true;
				emp.time = Integer.parseInt(fileValue[1]);
				calander[i] = emp;
				employee emp1 = new employee();
				emp1.name = fileValue[0];
				emp1.time = Integer.parseInt(fileValue[2]);
				emp1.isStart = false;
				calander[++i] = emp1;
				i++;
			}
			System.out.println(calander[0].isStart + "   " + calander[1].isStart);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		EmpCa obj = new EmpCa();
		obj.readFile();
	}

}
