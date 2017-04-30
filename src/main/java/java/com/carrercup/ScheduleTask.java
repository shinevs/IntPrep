package com.carrercup;

/*
 * 
 *I am not sure that I properly understand the problem but we could sort tasks by task frequences 
 *- most frequent first and than execute the largest group of different taks till it is possible 
 *and wait between them - this is greedy approach. for example we have AAAAAABBBBCCCD - > we produce 
 *ABCD_ABC_ABC_AB_A_A -> 10
 * 
 * With a cold time of 2, we can do even better.
 * ABCABCABCABDA
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ScheduleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduleTask obj = new ScheduleTask();
		System.out.println(obj.taskSchedule("AAABBBBBBCCCD", 2));
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	//// AABD
	// ABDA
	String taskSchedule(String str, int k) {
		StringBuilder result = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (map.containsKey(curr)) {
				Integer val = map.get(curr);
				map.put(curr, val + 1);
			} else {
				map.put(curr, 1);
			}
		}

		Map<Character, Integer> sortedMap = sortByValue(map);
		int consumed = 0;
		char prevc = '-';
		int j = k + 1;
		while (consumed < str.length()) {
			for (Character c : sortedMap.keySet()) {
				if (j == 0) {
					j = k + 1;
					prevc = '-';
					break;
				}
				if (map.get(c) > 0) {
					if (prevc == c) {
						result.append("_");
					} else {
						result.append(c);
						Integer val = map.get(c);
						map.put(c, val - 1);
						consumed++;
						prevc = c;
					}
					j--;
				}
				if (consumed == str.length()) {
					break;
				}
			}
		}
		return result.toString();
	}
}
