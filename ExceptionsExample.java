/*Exception is an elegant way of handling errors 
 * What are errors? any condition that terminates the program 
 * 		Logical error (bugs, example trying to access an index that is 
 * 			outof range, division by 0)  
 * 		input example you expect an integer, but the input is a string
 * 		Files (if the file does not exist, )
 * 		all these errors can be handled
 * There are errors that you cannot handle (unchecked), JVM has a problem
 * 			cpu has a problem. Nothing you can do.  
 * How do you handle an exception? using a 
 	try and catch statement
 	try{ 
 			//the code you want try, possibly to trigger an exception
 	} catch (ExceptionType exceptionVariable) {
 		//handle the exception 
 	} finally{
 		//the code that you want to execute no matter if an exception
 		//is triggered or not 
 	}
 	Let's illustrate with an input example. Design a program that asks 
 	the user for an integer and displays the number 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		//create an object Scanner 	
		int num;
		boolean done = false;
		while(done == false) {
			try{
				Scanner kb = new Scanner(System.in);
				System.out.println("Please enter an integer: ");
				num = kb.nextInt();
				//if we get here without an exception, it means 
				//the number is good 
				done = true;
				System.out.println("Your number is: " + num);
				
			}catch(InputMismatchException e){
				System.out.println("You did not input an integer");
				//you need to empty the keyboard. 
			}
		}
		/* Try this: 
		 * Design a program that accepts two integers A and B and computes
		 * the quotient of the two integers A/B
		 * Enter the following values 12, 3 should get 4 .
		 * Enter again: 12 0 see what you get. Fix it using a try-catch
		 * 
		 */
		
		do{
			try{
				Scanner kb = new Scanner(System.in);
				System.out.println("Please enter two integer: ");
				int A = kb.nextInt();
				int B = kb.nextInt();
				int div = A/B;
				//if we get here without an exception, it means 
						//div  is good 
				done = true;
				System.out.println(A + "/" + B + " = " + div);
				kb.close();//close the keyboard only when you dont need 
				//it anymore
			}catch(ArithmeticException e) {
				System.out.println("The second number should not be 0");
				done = false;
			}
		}while(done == false);
	}
}

/*int i = 12;
int j = 2;

try {
	int result = j / (j - 2);
	System.out.println(result);
} catch(Exception e) {
	System.out.println("Error: " + e.getMessage());
	e.printStackTrace();
*/