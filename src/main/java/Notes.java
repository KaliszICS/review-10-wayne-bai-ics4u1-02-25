
class Notes {
	public static void main(String[] args) {

		int count = 0; 
		int sum = 0;

		//nested loop

		for (int i = 0; i < 5; i++) { //runs 5 times
			for (int j = 0; j < 3; j++) { //variables have to be different for nested for loops
				// run 15 times (3 times, 5 times)
				if (i < 2) { //usually counters are found within if statements
					count++; //this is the same as count = count + 1
				}
				sum += i; //sum = sum + j
				
			}
		}

		System.out.println(count);
		System.out.println(sum);

		//Using assumptions in coding (making an assumption then disproving it)

		// prime numbers

		int num = 7;
		boolean isPrime = true; //this is our assumption that all numbers are prime until proven otherwise

		//figure out code to disprove if a number is prime
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				// return false;
			}
		}
		System.out.println(isPrime);
		// return true;

	}
}
