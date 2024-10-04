package com.bptn.course._08_exceptions._01_unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("input number: ");
			int num = scan.nextInt();
			int res = 100 /num;
			System.out.println(res);
			
		} catch (ArithmeticException e) {
			System.out.println("invalid: " + e.getMessage());
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("input an integer: " + e.getMessage());
			e.printStackTrace();
		}
		
		
		scan.close();
		
	}

}
