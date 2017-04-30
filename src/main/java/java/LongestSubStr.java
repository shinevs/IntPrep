import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongestSubStr {
	public static String FindLongestSubStr(String strIP) {
		List<Character> chList = new ArrayList<Character>();
		List<String> strList = new LinkedList<String>();
		int length = strIP.length();
		Character current;
		/*
		 * for ( int i = 0 ; i < length ; i++){ chList.add(strIP.charAt(i)); }
		 * if ( chList.contains(strIP.charAt(0))) { System.out.println(
		 * "it is availale"); //return null ; } first:
		 */
		int j = 0;
		for (int i = 0; i < length; i++) {
			// System.out.println("first for"+strIP.charAt(i));
			chList.add(strIP.charAt(i));
			StringBuffer sb = new StringBuffer(length);
			sb.append(strIP.charAt(i));
			for (j = i + 1; j < length; j++) {
				current = strIP.charAt(j);
				// System.out.println("current" + current + "jis:" + j +
				// strIP.charAt(j));
				if (chList.contains(current)) {
					strList.add(sb.toString());
					chList.clear();
					// System.out.println("continue" + sb.toString());
					// continue first;
					break;
				} else if ((j + 1) == length) {

					sb.append(current);
					strList.add(sb.toString());
					chList.clear();
				} else {
					// System.out.println("else : " +
					// sb.append(current).toString());
					chList.add(current);
					sb.append(current);
				}
			}
		}
		for (String str : strList) {
			System.out.println("values: " + str);
		}
		return "abc";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FindLongestSubStr("MyNameisshine");
		FindLongestSubStr("abash");
	}

}
