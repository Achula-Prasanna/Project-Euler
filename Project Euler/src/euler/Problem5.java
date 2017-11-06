package euler;

public class Problem5 {

	public static void main(String[] args) {
		int num = 21, count = 0;
		while(true){
			count = 0;
			for(int i = 1 ; i <= 20 ; i++){
				if(num % i == 0){
					count++;
				}
			}
			if(count == 20){
				System.out.println(num);
				break;
			}
			num++;
		}

	}

}
