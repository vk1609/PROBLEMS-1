import java.util.Scanner;
public class OddOrEven
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        String s = (num % 2 != 0) ? "odd" : "even";
        System.out.println(num + " is an " + s);

    }
}