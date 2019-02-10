/*
https://www.careercup.com/question?id=16759664
You have k lists of sorted integers. Find the smallest range that includes at least one number from each of the k lists.
For example,
List 1: [4, 10, 15, 24, 26]
List 2: [0, 9, 12, 20]
List 3: [5, 18, 22, 30]
The smallest range here would be [20, 24] as it contains 24 from list 1, 20 from list 2, and 22 from list 3.
*/



/*
There are k lists of sorted integers. Make a min heap of size k containing 1 element from each list. Keep track of min and max element and calculate the range.
In min heap, minimum element is at top. Delete the minimum element and another element instead of that from the same list to which minimum element belong. Repeat the process till any one of the k list gets empty.
Keep track of minimum range.
For eg.
List 1: [4, 10, 15, 24, 26]
List 2: [0, 9, 12, 20]
List 3: [5, 18, 22, 30]
Min heap of size 3. containing 1 element of each list
Heap [0, 4, 5]
Range - 6
Remove 0 and add 9
Heap [4, 9, 5]
Range - 6
Remove 4 and add 10
Heap [5, 9, 10]
Range - 6
and so on....
Finally you will yield the result.
*/

public class SmallestRangeFromArrays {

// Java program to finds out smallest range that includes
// elements from each of the given sorted lists.


    static final int N = 5;

    // array for storing the current index of list i
    static int ptr[] = new int[501];

    // This function takes an k sorted lists in the form of
// 2D array as an argument. It finds out smallest range
// that includes elements from each of the k lists.
    static void findSmallestRange(int arr[][], int n, int k) {
        int i, minval, maxval, minrange, minel = 0, maxel = 0, flag, minind;

        //initializing to 0 index;
        for (i = 0; i <= k; i++) {
            ptr[i] = 0;
        }

        minrange = Integer.MAX_VALUE;

        while (true) {
            // for mainting the index of list containing the minimum element
            minind = -1;
            minval = Integer.MAX_VALUE;
            maxval = Integer.MIN_VALUE;
            flag = 0;

            //iterating over all the list
            for (i = 0; i < k; i++) {
                // if every element of list[i] is traversed then break the loop
                if (ptr[i] == n) {
                    flag = 1;
                    break;
                }
                // find minimum value among all the list elements pointing by the ptr[] array
                if (ptr[i] < n && arr[i][ptr[i]] < minval) {
                    minind = i;  // update the index of the list
                    minval = arr[i][ptr[i]];
                }
                // find maximum value among all the list elements pointing by the ptr[] array
                if (ptr[i] < n && arr[i][ptr[i]] > maxval) {
                    maxval = arr[i][ptr[i]];
                }
            }

            //if any list exhaust we will not get any better answer ,so break the while loop
            if (flag == 1) {
                break;
            }

            ptr[minind]++;

            //updating the minrange
            if ((maxval - minval) < minrange) {
                minel = minval;
                maxel = maxval;
                minrange = maxel - minel;
            }
        }
        System.out.printf("The smallest range is [%d , %d]\n", minel, maxel);
    }

    // Driver program to test above function
    public static void main(String[] args) {

        int arr[][] = {
                {4, 7, 9, 12, 15},
                {0, 5, 10, 14, 20},
                {6, 12, 16, 30, 50}
        };

        int k = arr.length;

        findSmallestRange(arr, N, k);

    }
}
