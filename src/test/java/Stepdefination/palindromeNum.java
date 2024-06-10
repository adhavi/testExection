package Stepdefination;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String[] args) {
		int num=12321;
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;	//1
			num=num/10;
			
			}
		if(num==rev) {
		System.out.println(num+"palindrome numer");
		}
		
		else
		{
			System.out.println(num+"not pal");
		}

	}

}

