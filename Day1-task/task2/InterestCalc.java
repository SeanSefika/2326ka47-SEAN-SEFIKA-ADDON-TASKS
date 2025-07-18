package task2;
import java.util.Scanner;

public class InterestCalc 
{ 
	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Principal amount (P): ");
        float P = s.nextFloat();

        System.out.println("Enter Rate of Interest (R): ");
        float R = s.nextFloat();

        System.out.println("Enter Time (T): ");
        float T = s.nextFloat();

        if (P > 0 && R > 0 && T > 0) 
        {
            double interest = (P * R * T) / 100;
            System.out.println("Simple Interest = " + interest);
        } 
        else 
        {
            System.out.println("Please enter valid input for P, R, and T.");
        }

        s.close();
    }
}
