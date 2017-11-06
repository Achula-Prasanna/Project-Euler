package euler;

public class Problem4 {

	public static void main(String[] args) {
		long largetsPallindrome = 0;
		for(int i = 100 ; i <= 999 ; i++){
			for(int j = 100 ; j <= 999 ; j++ ) {
				if(isPallindrome(i * j) && largetsPallindrome < (i*j)) {
					largetsPallindrome = i * j;
				}
				 
			}
		}
		System.out.println(largetsPallindrome);
	}
	public static boolean isPallindrome(int n) {
		int num = n , r = 0, p = 0;
		while(num > 0) {
			r = num % 10;
			p = r + (p * 10);
			num = num / 10;
		}
		if( p == n){
			return true;
		}else {
			return false;
		}
	}

}
