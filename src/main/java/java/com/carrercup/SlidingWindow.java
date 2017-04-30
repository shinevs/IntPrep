package com.carrercup;

/*
 * 
 * Given a long string s and short strings t1, t2, t3 (which can have different length)
 *  find the shortest substring of s which contains t1, t2 and t3.

step-1 : Use some pattern matching alogo like KMP
output of step-1:
short position_t1[strlen(str)];
short position_t2[strlen(str)];
short position_t3[strlen(str)];

step-2:


short sliding_window[3];
int final_answer = INT_MAX;

for (i = 0 ; i < strlen(str); ++i) {
	if (pos_t1[i]) {
		sliding_window[0] = i;
	}

	if (pos_t2[i]) {
		sliding_window[1] = i;
	}

	if (pos_t3[i]) {
		sliding_window[2] = i;
	}

	if (sliding_window[0] != 0 && sliding_window[1] != 0 && sliding_window[2] != 0) {
		possible_answer = cal_width(sliding_window);
		if (possible_answer < final_answer) {
			final_answer = possible_answer;
		}

		sliding_window[lesser_position_of_3(sliding_window)] = 0;  
	}	

}

printf("%d\n", final_answer);
 * 
 * 
 */
public class SlidingWindow {
	public static void main(String[] args) {
		SlidingWindow obj = new SlidingWindow();
		int[] arr = { 12, 34, 11, 45, 12, 67, 34, 11 };
		int[] val = { 67, 34, 11 };
		obj.findShortestIndex(arr, val);

	}

	public void findShortestIndex(int[] arr, int[] val) {
		int[] index1 = new int[10], index2 = new int[10], index3 = new int[10];
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val[0]) {
				index1[x++] = i + 1;
			} else if (arr[i] == val[1])
				index2[y++] = i + 1;
			else if (arr[i] == val[2])
				index2[z++] = i + 1;
		}
		int number, min = 10, a = 0, b = 0, c = 0;
		for (int i = 0; i < index1.length; i++) {
			for (int j = 0; j < index2.length; j++) {
				for (int k = 0; k < index3.length; k++) {
					number = index1[i] - index2[j];
					number = (number < 0 ? -number : number);
					number = number - index3[k];
					number = (number < 0 ? -number : number);
					if (number < min) {
						min = number;
						a = i;
						b = j;
						c = k;
					}
				}
			}
		}
		System.out.println(a + ":" + b + ":" + c);

	}
}
