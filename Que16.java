package lab1;
import java.util.Scanner;
public class Que16 {
	public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = scanner.nextInt();
    scanner.close();
    int factorial = fact(num);
    System.out.println("Factorial of enetered number is:"+factorial);
	}
	static int fact(int n)
	{
      int output;
      if(n==1) {
    	  return 1;
      }
      output = fact(n-1)* n;
      return output;
	}

}
