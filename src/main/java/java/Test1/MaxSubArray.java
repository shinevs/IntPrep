package Test1;

public class MaxSubArray {

	public int maxScan(int[] arr) {
		int maxValue = arr[0], finalValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxValue = Math.max(arr[i], maxValue + arr[i]);
			finalValue = Math.max(maxValue, finalValue);
		}
		return finalValue;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 5, -1, -2, 2, 3, -1, 2, -2 };
		MaxSubArray obj = new MaxSubArray();
		System.out.println(obj.maxScan(arr));
	}
}
