package com.calculator;

public class Exam {
	static int value10B = 10;
	static boolean a,b,c;
	public static void main(String[] args) {
		
		System.out.println("========== ONE ================");
		number1();
		System.out.println("========== TWO ================");
		System.out.println(number2(8));
		System.out.println("========== THREE ================");
		System.out.println(number3(2,2));
		System.out.println("========== FOUR ================");
		System.out.println(number4(2,10));
		System.out.println("========== SEVEN ================");
		System.out.println(number7(2));
		System.out.println("========== 10A ================");
		System.out.println(number10A());
		System.out.println("========== 10B ================");
		System.out.println(number10B());
		System.out.println("========== 10C ================");
		System.out.println(number10C());
		System.out.println("========== 10D ================");
		System.out.println(number10D());
		System.out.println("========== 10E ================");
		System.out.println(number10E());
		
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
	
	public static int number7(int num) {
		boolean done = false;
		int count=1;
		int current = num+2;
		while(!done){
			current=current/count;
			if(current%3 ==0) done=true;
			else if(current<1) 
				done=true;
			else
				count +=1;
			System.out.println(current);
		}
		System.out.println(count);
		return count;
		}
	
	public static long number10A() {
		double count;
		int limit;
		count=9.0;
		limit=43/4;
		for(; count<=limit; count=count+0.5) {
			System.out.println("in for: " +  count);
		}
		System.out.println("after for: " + count);
		return (long)count;
	}
	public static int number10B() {
		System.out.println("Main before p1: " + value10B);
		value10B= p1(value10B);
		System.out.println("Main before p2: " + value10B);
		value10B= p2(value10B);
		System.out.println("Main at the end: " + value10B);
		System.out.println("-----------");
		int value=30;
		System.out.println("Main before p1: " + value10B);
		value10B= p1(value10B);
		System.out.println("Main before p2: " + value10B);
		value10B= p2(value10B);
		System.out.println("Main at the end: " + value10B);
		return value10B;
	}
	static int p1(int input) {
		value10B = input * value10B;
		System.out.println("In p1: " + value10B);
		return value10B;
	}
	static int p2(int input) {
		int value10B = 5;
		value10B = input / value10B;
		System.out.println("In p2: " + value10B);
		return value10B;
	}
	public static int number10C() {
		int value = 5;
		int value2 = 1;
		while(value2<4) {
			for(;value>=value2;value--) {
				System.out.println("*");
			}
			value2++;
		}
		return value;
	}
	public static boolean number10D() {
		a = true;
		b = false;
		c = false;
		System.out.println(a + " " + b +  " " + c + " ");
		do {
			if (b==c) b=a;
			else if(a == c) b = c;
			else a = c;
			System.out.println(a + " " + b +  " " + c + " ");
		}
		while(a || b || c);
		return b;
	}
	
	public static String number10E() {
		int one = 1;
		int two = 2;
		int three = 3;
		String res = "";
		do {
			one ++;
			System.out.print("cart");
			res = res + "cart";
		}while(one<3);
		for(int i =0; i<two; i++) {
			System.out.print("o");
			res=res+"o";
		}while(true) {
			three++;
			if(three==5) {
				break;
			}
			System.out.print("n");
			res=res+"n";
		}
		return res;
	}
	
}