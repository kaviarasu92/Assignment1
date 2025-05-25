package assignmnet.day2;

public class fibonacci {

	public static void main(String[] args) {
       int n=8, first = 0, second = 1;
           System.out.println("First " + n + " Fibonacci numbers:");
           for (int i = 0; i < n; i++) {
               if (i==0) {
                   System.out.print(first);
               } else if (i==1) {
                   System.out.print(", " + second);
               } else {
                   int next = first + second;
                   System.out.print(", " + next);
                   first = second;
                   second = next;
               }
           }
           System.out.println();
       }
   
	}

