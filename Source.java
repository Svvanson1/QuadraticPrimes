import java.math.*;

public class Source {

	public static void main(String[] args) {
		
		int largestPrime = 0, abSum = 0, temp = 0;
		
			for(int a = 0; a <= 1000; a++) {
				for(int b = 0; b <= 1000; b++) {
					temp = consecPrimeLength(a,b);
					if(temp > largestPrime) {
						largestPrime = temp;
						abSum = a*b;
					}
				}
			}
		System.out.println(abSum);
	}

    public static boolean primes(int num){
    for(int i = 2; i < num; i++){
        if(num % i == 0){
            return false;
        }
    }
   return true; 
}
    
    public static int consecPrimeLength(int a, int b) {
    	int total = 0, n = 0, quadValue = (int) Math.pow(n, 2) + (a*n) + b;
    	
    	while(primes(quadValue)) {
    	quadValue = (int) Math.pow(n, 2) + (a*n) + b;
    	total++;
    	n++;
    	}
    	
    	return total - 1;
    }
    
}
