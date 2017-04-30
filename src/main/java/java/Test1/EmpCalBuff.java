package Test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class Empl implements Comparable<Empl> {
	int time;
	String name;
	boolean isBegin;

	@Override
	public int compareTo(Empl o) {
		return (this.time > o.time) ? 1 : ((this.time < o.time) ? -1 : 0);
		// TODO Auto-generated method stub
		// return 0;
	}

}

public class EmpCalBuff {
	private void freeCalander(Empl[] cal) {
		int count = 0;
		for (int i = 0; i < cal.length; i++) {
			if (cal[i].isBegin)
				count++;
			else
				count--;
			if (count == 0 && i < cal.length - 1) {
				if (cal[i + 1].time - cal[i].time > 0) {
					System.out.println(cal[i + 1].time + " " + cal[i].time);
				}
			}

		}
	}

	public static void main(String[] args) {

		try {
			String srcFile = "/Users/shine/Documents/Java/JavaFileReader.txt";
			String readStr = "";
			Empl[] calander = new Empl[8];
			int i = -1;
			BufferedReader bufRead = new BufferedReader(new FileReader(srcFile));
			while ((readStr = bufRead.readLine()) != null) {
				String[] strArr = readStr.split("\\s");
				Empl emp = new Empl();
				emp.time = Integer.parseInt(strArr[1]);
				emp.name = strArr[0];
				emp.isBegin = true;
				calander[++i] = emp;
				Empl emp1 = new Empl();
				emp1.isBegin = false;
				emp1.name = strArr[0];
				emp1.time = Integer.parseInt(strArr[2]);
				calander[++i] = emp1;
				// System.out.println(strArr[0]);
			}
			Arrays.sort(calander);
			System.out.println(calander[0].name);
			EmpCalBuff obj = new EmpCalBuff();
			obj.freeCalander(calander);

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
