package Test1;

import java.util.HashMap;
import java.util.Map;

public class ReadNumbers {

	public void readNumberAndCount(Integer[] arr) {
		Map<Integer, Integer> NumCount = new HashMap<Integer, Integer>();
		Integer k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!NumCount.containsKey(arr[i])) {
				NumCount.put(arr[i], 1);
			} else {
				k = NumCount.get(arr[i]);
				NumCount.put(arr[i], k++);
				NumCount.put(arr[i], NumCount.get(arr[i]) + 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 3, 1, 2, 3, 4, 5 };
	}

}
