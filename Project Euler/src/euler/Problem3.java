package euler;

public class Problem3 {

	public static void main(String[] args) {
		 long largestPrime = 0l;
		 for( long i = 3 ; i * i <  600851475143l ; i += 2) {			 
			 if(isPrime(i) && 600851475143l % i == 0){
				 if(largestPrime < i){
					 largestPrime = i;
				 }
			 }
		 }
		 System.out.println(largestPrime);

	}
	public static boolean isPrime(long num) {
		if(num % 2 == 0){
			return false;
		}
		for(long j=3 ; j * j <= num ; j += 2 ) {
			 if(num % j == 0) {
				 return false;
			 }
		 }
		 	 return true;
	}

}
