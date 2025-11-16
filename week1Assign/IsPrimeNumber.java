package week1Assign;

public class IsPrimeNumber {
	 public static void main(String []args) {
		 int n = 10;
		 boolean isPrime = true;
		 for(int i = 2; i<=n/2;i++) {
			 if(n%1==0) {
				 isPrime = false;
				 break;
			 }
		 }
		 if(isPrime) {
			 System.out.println("Prime "+n);
		 }
		 else {
			 System.out.println("Not prime "+n);
		 }
	 }

}
