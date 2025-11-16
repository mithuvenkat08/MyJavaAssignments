package week1Assign;

public class IsPalindrome {
	public static void main(String[] args) {
		int num = 1214;
		int temp=num, rev=0;
		while(num>0) {
			rev = rev*10+(num%10);
			num =num/10;
		}
			if(rev == temp) {
				System.out.println("Given Num is: "+temp+"\nOutput is: "+rev+"\nThe number is Palindrome");
			}
			else {
				System.out.println("Given Num is: "+temp+"\nOutput is: "+rev+"\nThe number is not a Palindrome");
			}
		}

}
