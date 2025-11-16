package week1Assign;

public class Fibonacci {
	public static void main(String[]args) {
		int a,b,c;
		a=0;
		b=1;
		String temp = "";
		for(int i = 1; i<=8; i++) {
			c = a+b;
			temp = temp+a+",";
			a=b;
			b=c;
		}
		System.out.println(temp);
	}
}
