import java.util.Scanner;
class FactorialMethod
{
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main(String[] args) 
	{
		int i,fact=1;
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		fact=factorial(num);
		System.out.println("Factorial is"+fact);
	}
}