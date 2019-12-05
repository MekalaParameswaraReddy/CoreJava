package com.paru.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class BasicPrograms {

	public void getBackTriangleStar(int size) {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				System.out.print("*");
			}
			System.out.println("");			
		}
	}

	/**
	 * 
	 * Fobinaci series.
	 */
	public void getFobinaci(int size) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i < size; ++i) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	/**
	 * 
	 * * ** **** *****
	 */
	public void getTriangleStar(int size) {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * polyndrom or not
	 * 
	 */
	public void polyndrom_1(int number) {
		int temp = number;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		if (temp == reverse) {
			System.out.println("given number is polindorm");
		} else {
			System.out.println("not");
		}

	}

	/**
	 * polyndrom or not
	 * 
	 */
	public void polyndrom_2(int num) {
		int reverse = 0;
		int temp = num;
		while (num > 0) {
			int rim = num % 10;
			reverse = rim + (reverse * 10);
			num = num / 10;
		}
		if (reverse == temp) {
			System.out.println("yes " + reverse);
		} else {
			System.out.println("not " + reverse);
		}
	}

	/**
	 * Factorial of given number
	 */
	public void getFactorial_1(int num) {
		int n = num;
		int result = num;
		while (num > 1) {
			result = result * (num - 1);
			num = num - 1;
		}
		System.out.println("Factorial of " + n + " is " + result);
	}

	/**
	 * Factorial of given number
	 */
	public void getFactorial_2(int num) {
		int result = 1;
		for (int i = 1; i <= num; ++i) {
			result = result * i;
		}
		System.out.println("Factorial of " + num + " is " + result);
	}

	/**
	 * It will to infinity loop
	 */
	public void infinityLoop() {
		final int a = 10, b = 20;
		int i = 0;
		while (a < b) {
			System.out.println("Hello" + i);
			i++;
		}
	}

	/**
	 * Equal character for given number
	 */
	public void equalentChars(int number) {
		String a = "0", b = "1", c = "2", d = "3", e = "4", f = "5", g = "6", h = "7", i = "8", j = "9";
		String stringNumber = String.valueOf(number);
		System.out.println(stringNumber);
		int lenght = stringNumber.length();
		for (int m = 0; m < lenght; ++m) {
			String s = stringNumber.substring(m, m + 1);
			if (s.equals(a)) {
				System.out.print("a");
			}
			if (s.equals(b)) {
				System.out.print("b");
			}
			if (s.equals(c)) {
				System.out.print("c");
			}
			if (s.equals(d)) {
				System.out.print("d");
			}
			if (s.equals(e)) {
				System.out.print("e");
			}
			if (s.equals(f)) {
				System.out.print("f");
			}
			if (s.equals(g)) {
				System.out.print("g");
			}
			if (s.equals(h)) {
				System.out.print("h");
			}
			if (s.equals(i)) {
				System.out.print("i");
			}
			if (s.equals(j)) {
				System.out.print("j");
			}
		}
	}

	public void arryfill() {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		// arr[5] =1; //Runtime Exception AIOOBE
		Arrays.fill(arr, 1, 4, 8);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
		}
		// O/p: 18881
	}
	
	public void leftRightSumEqualTest(int[] numbers) {
		int mid = numbers.length / 2;
		int lenght = numbers.length;
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < mid; ++i) {
			leftSum += numbers[i];
		}
		if (lenght % 2 == 0) {
			for (int i = mid; i < lenght; ++i) {
				rightSum += numbers[i];
			}
		} else {
			for (int i = mid + 1; i < lenght; ++i) {
				rightSum += numbers[i];
			}
		}
		System.out.println("Left numbers Sum from mid = " + leftSum);
		System.out.println("Right numbers Sum from mid = " + rightSum);
		if (leftSum == rightSum) {
			System.out.println("From mid to left numbers sum & Right numbers sum is equal:");
		} else {
			System.out.println("From mid to left numbers sum & Right numbers sum is not equal:");
		}
	}

	public void swapWithOutTemp() {
		int x = 10;
		int y = 20;
		System.out.println("Before swapping: x = " + x + "; y = " + y);
		x = x + y;	
		y = x - y;
		x = x - y;
		System.out.println("After swapping: x = " + x + "; y = " + y);
	}

	public void swapWithTemp() {
		int x = 10;
		int y = 20;
		System.out.println("Before swapping: x = " + x + "; y = " + y);
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping: x = " + x + "; y = " + y);
	}
	
	public void isAmstrong(int num) {
		int rem = 0;
		int actNum = num;
		int remCube = 0;
		while (num > 0) {
			rem = num % 10;
			remCube += rem * rem * rem;
			num = num / 10;
		}
		if (actNum == remCube) {
			System.out.println("given number " + actNum + " is amstrong");
		} else {
			System.out.println("given number " + actNum + " is not amstrong");
		}

	}
	
	public void isAmstrongDynamic(int num) {
		int length = String.valueOf(num).length();
		System.out.println(length);
		int rem = 0;
		int actNum = num;
		int remCube = 0;
		while (num > 0) {
			rem = num % 10;
			int temp = 1;
			for (int i = 0; i < length; ++i) {
				temp *= rem;
			}
			remCube += temp;
			num = num / 10;
		}
		System.out.println(remCube);
		if (actNum == remCube) {
			System.out.println("given number " + actNum + " is amstrong");
		} else {
			System.out.println("given number " + actNum + " is not amstrong");
		}
	}
	
	public void AmstrongNmumberSeries() {
		
	}

	public void isDigit() {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('1');
		al.add('a');
		al.add('3');
		al.add('b');
		al.add('4');
		al.add('c');
		for (int i = 0; i < al.size(); ++i) {
			Character ch = al.get(i);
			if (ch.isDigit(ch)) {
				System.out.println(ch);
			}
		}
	}

	public void highSeqCount() {
		Hashtable<Integer, Character> ht = new Hashtable<Integer, Character>();
		String number = "33333333333333332211533333333333333377996666666666";
		for (int i = 0; i < number.length(); ++i) {
			int count = 1;
			for (int j = i + 1; j < number.length(); ++j) {
				if (number.charAt(i) == number.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			if (count >= 2) {
				// System.out.println(number.charAt(i) + " repeated " + count);
				ht.put(count, number.charAt(i));
			}
		}
		System.out.println(ht);
		Object repeatedTimes = ht.keySet().toArray()[0];
		Object repeatedValues = ht.get(repeatedTimes);
		System.out.println(repeatedValues + " is repeated  " + repeatedTimes + " times");
	}
	public void printNumbersFormString(String sentense) {
		int size = sentense.length();
		String chars = "";
		String numbers = "";
		Character ch[] = new Character[size];
		for (int i = 0; i < size; ++i) {
			ch[i] = sentense.charAt(i);
			if (ch[i].isDigit(ch[i])) {
				numbers = numbers + ch[i];
			} else {
				chars = chars + ch[i];
			}
		}
		System.out.println("number are ==" + numbers);
		System.out.println("chars are ===" + chars);
	}

	public void getUniqueChar(String str1, String str2) {
		// System.out.println(System.getProperty("user.dir"));
		String result = "";
		for (int i = 0; i < str1.length(); ++i) {
			boolean flag = true;
			for (int j = 0; j < str2.length(); ++j) {
				if (str1.charAt(i) == str2.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result = result + str1.charAt(i);
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		BasicPrograms basicPrograms = new BasicPrograms();
		 //basicPrograms.getBackTriangleStar(4);// not completed
		// basicPrograms.getTriangleStar(4);
		// basicPrograms.polyndrom_1(131);
		// basicPrograms.polyndrom_2(131);
		// basicPrograms.getFobinaci(123);
		// basicPrograms.infinityLoop();
		// basicPrograms.getFactorial_1(9);
		// basicPrograms.getFactorial_2(10);
		// basicPrograms.arryfill();
		// basicPrograms.equalentChars(451091017);
		//int numbers[] = { 1, 3, 2, 4, 2, 1, 3, 4 };
		//basicPrograms.leftRightSumEqualTest(numbers);
		//basicPrograms.swapWithOutTemp();
		//basicPrograms.swapWithTemp();
		//basicPrograms.isAmstrong(371);
		//basicPrograms.isAmstrongDynamic(1634);
		//basicPrograms.isDigit();
		//basicPrograms.printNumbersFormString("a1b2c3d4");
		//basicPrograms.getUniqueChar("ABC", "BC");
		//basicPrograms.getUniqueChar("BENGALORE", "BA");
		 basicPrograms.highSeqCount();
	}
}
