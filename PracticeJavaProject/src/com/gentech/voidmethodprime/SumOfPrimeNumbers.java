package com.gentech.voidmethodprime;
class PrimeUtil {
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static void sumOfPrimesInRange(int start, int end) {
		int sum = 0;
		System.out.println("Sum of prime numbers from " + start + " to " + end + ":");
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				sum += i;
			
			}
		}System.out.print(sum + ",");
		System.out.println(); // Print a newline for better formatting.
	}
}

public class SumOfPrimeNumbers {
	public static void main(String[] args) {
		PrimeUtil.sumOfPrimesInRange(100, 200);
	}
}
