
import java.util.Arrays;
import java.util.HashSet;

//Find the repeated number in an array
//better use HashMap method - FirstNonRepeated :) 
public class ArrayRepeatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet();
		hs.add("new");
		hs.add("new"); // will not allow duplicates, means it will overrite
		hs.add(null); // allow one null

		System.out.println("value" + hs.size());
		Integer a[] = { 1, 3, 22, 1, 44, 5, 5, 3 };
		Arrays.sort(a);
		for (Integer i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1])
				System.out.println(a[i]);
		}
	}

}
