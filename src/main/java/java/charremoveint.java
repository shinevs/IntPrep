
public class charremoveint {
	public static String removechar(String str, int num) {
		int i = str.length();
		char current = str.charAt(0);
		int count = 0;
		StringBuffer sb = new StringBuffer(i);
		// sb.setLength(i);

		for (int itr = 0; itr < i; itr++) {

			if (current == str.charAt(itr)) {
				count++;

				if (count <= num) {

					sb.append(str.charAt(itr));

				}
			} else {
				current = str.charAt(itr);
				count = 1;
				sb.append(str.charAt(itr));
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "aafsbbbwerccc";
		int num = 1;
		System.out.println("Final OP:" + removechar(value, num));
	}

}
