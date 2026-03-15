package BasicArraysPrograms;

public class PalindromeNumber {

	public static void main (String[]args) {
		
		int num = 3546575;
		int og = num; 
		int reverse = 0;
		
			
			while(num!=0) {
				int rev = num % 10;
				reverse = reverse * 10 + rev;
				num= num /10;
			}
		
			
			if(og==reverse) {
				
			System.out.println("Its Palindrome");
			} else {
				System.out.println("Its not Palindrome");
				
			}
		}
		
		
	}

