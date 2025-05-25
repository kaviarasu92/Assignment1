package assignmnet.day2;

public class Palindrome {

	public static void main(String[] args) {
		int i=1221, output = 0, remainder, original;

        original = i; // Store the original value

        // Use for loop to reverse the digits of 'input'
        for (i=original; i != 0; i /= 10) {    
            remainder = i % 10;
            output = output * 10 + remainder;
        }

        // Compare and print whether it's a palindrome
        if (original == output) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

    }
}
	