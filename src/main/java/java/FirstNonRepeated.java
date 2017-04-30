

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class new1 {
	Integer i;
	String s;
}

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new1 n1=new new1();
		// Set<new1> s1= new HashSet<new1>(); //set example
		// s1.add(n1);
		System.out.println(" Input string");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = firstnonrepeat(s);
		System.out.println(" OP" + c);
		in.close();
	}

	public static Character firstnonrepeat(String s) {
		Character c;
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		// Hashtable<String,Integer> ht= new Hashtable<String,Integer>();

		Integer len = s.length();
		for (Integer i = 0; i < len; i++) {
			c = s.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			// System.out.println(entry.getKey()+","+entry.getValue());
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		return null;
	}

}
