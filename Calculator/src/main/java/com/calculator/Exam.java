package com.calculator;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		System.out.println("========== ONE ================");
		number1();
		System.out.println("========== TWO ================");
		System.out.println(number2(8));
		System.out.println("========== THREE ================");
		System.out.println(number3(2,2));
		System.out.println("========== FOUR ================");
		System.out.println(number4(2,10));
		
	}

	public static String number1() {
		int i = 1;
		for (int j = 0; j < 5; j = j + 2) {
			i = (i * i) + j;
		}
		switch (i) {
		case 3:
			System.out.println("zero");
			return "zero";
		case 13:
			System.out.println("one");
			return "one";
		case 175:
			System.out.println("two");
			return "two";
		default:
			System.out.println("default");
			return "default";
		}
	}

	public static int number2(int n) {
		int F_0 = 1, F_1 = 1;
		int F_n = 0;
		/*System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt(); */
		for (int i = 1; i < n; i++) {
			F_n = F_0 + F_1;
			F_0 = F_1;
			F_1 = F_n;
		}
		return F_n;
	}

	public static int number3(int inner, int outer) {
		int result = 0;
		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				result = (result * result) + 1;
			}
		}
		return result;
	}
	
	public static int number4(int x, int y) {
		int count = 0;
		while (x < y)
		{
			System.out.println ("Hello");
			x = x + 1;
			y = y - 1;
			count++;
		}
		return count;
	}
	
}
