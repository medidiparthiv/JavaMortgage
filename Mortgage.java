import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    
	    
	    System.out.print("Enter Home Value : ");
	    int h = x.nextInt();
	    
	    System.out.print("Enter Down Payment : ");
	    int d = x.nextInt();
	    int Balance = h - d;
	    System.out.println("Your Balance is $" + Balance);
	    
	    System.out.print("Enter Number of Years : ");
	    int y = x. nextInt();
	    
	    System.out.println("Your Mortgage is : ");
	    double Mortgage = Balance/(y*12);
	    
	    System.out.println(Mortgage);
	}
}
