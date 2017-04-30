package com.carrercup;

/*
 * 
 * Given an array of elements, return an array of values pertaining to how many
 * elements are greater than that element remaining in the array.
 * 
 * Brute force is obvious, but must be done faster than O(n^2)
 * 
 * Ex. [3,4,5,9,2,1, 3] Return [3, 2, 1, 0, 1, 1, 0] First element is 3 because
 * 3<4,5,9. Second element is 2 because 4< 5,9 etc
 * 
 */
// public class NumberOfGreaterValue {
// public void getNumber(Integer[] arr){
// int j=0;
// HashMap<Integer,Integer> valueMap = new HashMap<Integer,Integer>();
// valueMap.put(arr[arr.length-1],0);
// for( int i = arr.length -2; i> 0;i--){
// j=i;
// while(j<arr.length){
//
// }
// }
// }
