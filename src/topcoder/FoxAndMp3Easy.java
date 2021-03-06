package topcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 
Problem Statement
����
Fox Ciel loves music. She currently has n songs in her mp3 player. Their file names are "1.mp3", "2.mp3", and so on, until string(n)+".mp3".   Sadly, Ciel's mp3 player does not sort the files according to the number. Instead, it simply sorts the file names in lexicographic order, as strings. So, for instance, if n=10 then the sorted order looks as follows: "1.mp3", "10.mp3", "2.mp3", ..., "9.mp3".   You are given the int n. If n is at most 50, return a String[] containing the entire sorted list of file names. If n is more than 50, return a String[] containing the first 50 elements of the sorted list of file names.
Definition
����
Class:
FoxAndMp3Easy
Method:
playList
Parameters:
int
Returns:
String[]
Method signature:
String[] playList(int n)
(be sure your method is public)
����

Notes
-
The string A is lexicographically smaller than the string B if either of the following two conditions holds: 1. A is a proper prefix of B; 2. There is an index i such that the first (i-1) characters of A and B are equal, and character i of A has a smaller ASCII value than character i of B.
Constraints
-
n will be between 1 and 1,000, inclusive.
Examples
0)

����
3
Returns: {"1.mp3", "2.mp3", "3.mp3" }
We have 3 files: "1.mp3", "2.mp3", and "3.mp3". This is also their lexicographic order.
1)

����
10
Returns: 
{"1.mp3",
 "10.mp3",
 "2.mp3",
 "3.mp3",
 "4.mp3",
 "5.mp3",
 "6.mp3",
 "7.mp3",
 "8.mp3",
 "9.mp3" }
This is the example from the problem statement.
2)

����
16
Returns: 
{"1.mp3",
 "10.mp3",
 "11.mp3",
 "12.mp3",
 "13.mp3",
 "14.mp3",
 "15.mp3",
 "16.mp3",
 "2.mp3",
 "3.mp3",
 "4.mp3",
 "5.mp3",
 "6.mp3",
 "7.mp3",
 "8.mp3",
 "9.mp3" }

3)

����
32
Returns: 
{"1.mp3",
 "10.mp3",
 "11.mp3",
 "12.mp3",
 "13.mp3",
 "14.mp3",
 "15.mp3",
 "16.mp3",
 "17.mp3",
 "18.mp3",
 "19.mp3",
 "2.mp3",
 "20.mp3",
 "21.mp3",
 "22.mp3",
 "23.mp3",
 "24.mp3",
 "25.mp3",
 "26.mp3",
 "27.mp3",
 "28.mp3",
 "29.mp3",
 "3.mp3",
 "30.mp3",
 "31.mp3",
 "32.mp3",
 "4.mp3",
 "5.mp3",
 "6.mp3",
 "7.mp3",
 "8.mp3",
 "9.mp3" }

4)

����
109
Returns: 
{"1.mp3",
 "10.mp3",
 "100.mp3",
 "101.mp3",
 "102.mp3",
 "103.mp3",
 "104.mp3",
 "105.mp3",
 "106.mp3",
 "107.mp3",
 "108.mp3",
 "109.mp3",
 "11.mp3",
 "12.mp3",
 "13.mp3",
 "14.mp3",
 "15.mp3",
 "16.mp3",
 "17.mp3",
 "18.mp3",
 "19.mp3",
 "2.mp3",
 "20.mp3",
 "21.mp3",
 "22.mp3",
 "23.mp3",
 "24.mp3",
 "25.mp3",
 "26.mp3",
 "27.mp3",
 "28.mp3",
 "29.mp3",
 "3.mp3",
 "30.mp3",
 "31.mp3",
 "32.mp3",
 "33.mp3",
 "34.mp3",
 "35.mp3",
 "36.mp3",
 "37.mp3",
 "38.mp3",
 "39.mp3",
 "4.mp3",
 "40.mp3",
 "41.mp3",
 "42.mp3",
 "43.mp3",
 "44.mp3",
 "45.mp3" }

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 * 
 */

public class FoxAndMp3Easy {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String temp = null;
//		try {
//			temp = br.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int input = Integer.parseInt(temp);
//		FoxAndMp3Easy l = new FoxAndMp3Easy();
//		String[] finalArray = l.playList(input);
//		System.out.println(Arrays.toString(finalArray));
//		//System.out.println(finalArray.length);
//	}
	public String[] playList(int input){
		String[] list =  new String[input];
		for(int i=1;i<=input;i++){
			String temp2 = i+".mp3";
			list[i-1] = temp2;
		}
		Arrays.sort(list);
		if(input<=50){
		//System.out.println(Arrays.toString(list));
			Arrays.toString(list);
			return list;
		}
		else{
			String[] list2 = new String[50];
			for(int j=0;j<50;j++){
				//System.out.println(list[j]);
				list2[j] = list[j];
			}
			return list2;
		}
	}
}
