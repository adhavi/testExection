package Stepdefination;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		String str = "ABCD";
		String rev="";
		//		int len = str.length();
		//		str.charAt(0);
		//
		//		for(int i=len-1; i>=0;i--) {
		//
		//			rev=rev+str.charAt(i);
		//char a[]=str.toCharArray();
		//		int len=a.length;
		//		for(int i=len-1;i>=0;i--) {
		//			rev=rev+a[i];
		//string buffer class
		StringBuffer sb= new StringBuffer(str);

		System.out.println(sb.reverse());

	}

}

