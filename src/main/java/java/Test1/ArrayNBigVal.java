package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayNBigVal {

	public void findAndAssignNextVal(Integer[] intArr) {
		Stack<Integer> intStack = new Stack<Integer>();
		Integer length = intArr.length;
		intStack.push(intArr[length - 1]);
		for (int n = length - 2; n >= 0; n--) {
			Integer currentValue = intArr[n];
			while (!intStack.isEmpty() && currentValue > intStack.peek()) {
				intStack.pop();
			}

			if (!intStack.isEmpty()) {
				intArr[n] = intStack.peek();
				intStack.push(currentValue);
			} else {
				intStack.push(currentValue);
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 7, 5, 1, 6, 2, 6, 3, 4, 1, 2, 9, 11 };
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList = Arrays.asList(arr);

		ArrayNBigVal obj = new ArrayNBigVal();
		obj.findAndAssignNextVal(arr);
	}
}
