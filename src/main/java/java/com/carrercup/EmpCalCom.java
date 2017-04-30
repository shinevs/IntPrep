package com.carrercup;

import java.util.Arrays;

//

/*
 * Given an input of the calendar objects of 10,000 employees, input is a time interval T and an
 *  employee[] array, find the first interval where all the employees in the employee[] array are 
 *  free for a minimum time interval T (i.e schedule the meeting)
 * 
 * 
 * 
 */

//import System;
//using System.Collections.Generic;
//using System.Linq;
//using System.Text;
//using System.Threading.Tasks;
//using System.IO;

class EmpCalCom {
	public static void main(String[] args) {
		// Input file:
		// name begin end
		// Bob1 1 3
		// Bob2 2 4
		// Bob3 1 4
		// Bob1 5 6
		// Bob2 4 7
		// Bob3 5 6
		// String[] input_data = File.ReadAllText("").Split(new char[] {'\t' },
		// StringSplitOptions.RemoveEmptyEntries);
		Employee[] calendar = new Employee[12];
		// int j = 0;
		// // convert input file to the list. for each line in file, we make two
		// items: for begin and for end
		// for (int i = 0; i < input_data.Length; i++)
		// {
		// string[] employee = input_data[i].Split(new char[] {' ', '\r'},
		// StringSplitOptions.RemoveEmptyEntries);
		// Employee man = new Employee(employee[0], int.Parse(employee[1]),
		// true); // begin
		// calendar[j] = man;
		// j++;
		// man = new Employee(employee[0],int.Parse(employee[2]), false); // end
		// calendar[j] = man;
		// j++;
		// }
		Employee man = new Employee("Bob1", 1, true);
		calendar[0] = man;

		Employee man1 = new Employee("Bob1", 3, false);
		calendar[1] = man1;
		Employee man2 = new Employee("Bob2", 2, true);
		calendar[2] = man2;
		Employee man3 = new Employee("Bob2", 4, false);
		calendar[3] = man3;
		Employee man4 = new Employee("Bob3", 1, true);
		calendar[4] = man4;
		Employee man5 = new Employee("Bob3", 4, false);
		calendar[5] = man5;
		Employee man6 = new Employee("Bob1", 3, true);
		calendar[6] = man6;
		Employee man7 = new Employee("Bob1", 4, false);
		calendar[7] = man7;
		Employee man8 = new Employee("Bob2", 5, true);
		calendar[8] = man8;
		Employee man9 = new Employee("Bob2", 7, false);
		calendar[9] = man9;
		Employee man10 = new Employee("Bob3", 3, true);
		calendar[10] = man10;
		Employee man11 = new Employee("Bob3", 4, false);
		calendar[11] = man11;
		Arrays.sort(calendar);
		int count = 0;
		int t_min = 0;
		int start = 0, end = 0;
		// for (int i = 0; i < calendar.length; i++)
		// System.out.println(calendar[i].name + "," + calendar[i].time +
		// "," + calendar[i].is_begin);
		// finding when all employees are not work
		for (int i = 0; i < calendar.length; i++) {
			if (calendar[i].is_begin)
				count++;
			else
				count--;
			if (count == 0 && i < calendar.length - 1) {
				t_min = calendar[i + 1].time - calendar[i].time;
				if (t_min > 0) {
					start = calendar[i].time;
					end = calendar[i + 1].time;
					break;
				}
			}
		}
		System.out.println(t_min + "," + start + "," + end);
		// Console.ReadKey();
	}
}

class Employee implements Comparable<Employee> {
	public String name;
	public int time;
	public boolean is_begin;

	public Employee() {
	}

	public Employee(String in_name, int in_time, boolean in_is_begin) {
		name = in_name;
		time = in_time;
		is_begin = in_is_begin;
	}

	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.time > e.time ? 1 : (this.time < e.time ? -1 : 0);
	}
}
