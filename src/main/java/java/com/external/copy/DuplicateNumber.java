package com.external.copy;
//You have got a range of numbers between 1 to N, where one of 
//the number is repeated.
//You need to write a program to find out the duplicate number. - See more at: http://www.java2novice.com/java-interview-programs/duplicate-number/#sthash.sJDONUXf.dpuf
import java.util.ArrayList;
import java.util.List;
public class DuplicateNumber {
public int findDuplicate(List<Integer> List1)
{
	int Top = List1.size() - 1;
	int total = getSum(List1);
	int duplicate = total- (Top *(Top + 1 )/2); // n*((n+1)/2)
	return duplicate ;
}
public int getSum(List<Integer> List1 ){
	int sum=0;
	for ( int num:List1)
		sum+=num;
	return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = new ArrayList<Integer>();
		for (int i=1;i<30;i++){
			arr1.add(i);
		}
		arr1.add(11);
		DuplicateNumber dn= new DuplicateNumber();
		int op=dn.findDuplicate(arr1);
		System.out.println(op);
	}

}
