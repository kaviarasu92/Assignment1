package assignmnet.day2;

public class IsPrimeNumber {
	  public static void main(String[] args) {
		   int num = 0;
		   boolean prime = true;

		   // 0 and 1 are not prime numbers
		   if (num == 0 || num == 1) {
		    prime = false;
		    }

		    for (int i = 2; i <= num / 2; ++i) {

		      if (num % i == 0) {
		        prime = true;
		        break;
		      }
		    }

		    if (prime==true)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
