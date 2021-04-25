import java.util.Scanner;
class Temperature
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Celsius Temperature:");
		Scanner scan=new Scanner(System.in);
		float ct=scan.nextFloat();
		float Ft;
		Ft=((ct*9)/5)+32;
		System.out.println("Temperature from Celsius to Fahrenheit is"+Ft);
	}
}