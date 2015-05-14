//@author Young Nguyen
//Simple program that will print primes up to the integer given

public class Primes {
	//Main function
	public static void main (String[] args) {
		isPrime(Integer.parseInt(args[0]));
	}
	
	//prime-printing function up to int N
	private static void printPrimes(int N) {
		System.out.println("Prime list up to " + N + " is:");
		for (int p=1; p <= N; p++) {
			if (isPrime(p)) {
				System.out.print(p + " ");
			}
		}
	}
	
	//Return true if N is a prime
	private static boolean isPrime(int N){
		return !isDivisible(N, 2);
	}
	
	//Return true if N is divisible by any int from LOW to (but not including) N
	//Assume LOW > 1
	//Implement recursively
	private static boolean isDivisible(int N, int LOW){
		if (N <= LOW) {
			return false;
		} else if (N % LOW == 0) {
			return true;
		} else {
			return isDivisible(N, LOW+1);
		}
	}
	
}
