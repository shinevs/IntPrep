package Test1;

public class StrDuplicate {
	boolean findDuplicate(String str) {
		boolean[] charDupArr = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			if (charDupArr[value] == true) {
				return false;
			} else
				charDupArr[value] = true;

		}
		return true;
	}

	public static void main(String[] args) {
		String str = "abcdef";
		StrDuplicate obj = new StrDuplicate();
		System.out.println(obj.findDuplicate(str));
	}
}
