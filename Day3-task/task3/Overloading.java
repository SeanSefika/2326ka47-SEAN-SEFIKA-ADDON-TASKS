package task3;

public class Overloading 
{

	    static int sum(int a, int b) 
	    {
	        return a + b;
	    }

	    static double sum(double a, double b) 
	    {
	        return a + b;
	    }

	    public static void main(String[] args) 
	    {
	        System.out.println("Sum of integers: " + sum(5, 10));
	        System.out.println("Sum of doubles: " + sum(5.5, 10.5));
	    }
}