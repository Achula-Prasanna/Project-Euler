package euler;

public class Problem2 {

	public static void main(String[] args) {
		long a = 1l;
		long b = 2l;
		long c = 0l;
		long sum = 2l;
		while(a < 4000000l) {
			c = a + b;
			
			if( c % 2 == 0 ) {
				sum += c;
			}
			a = b;
			b = c;
		}
		System.out.println(sum);
	}

}