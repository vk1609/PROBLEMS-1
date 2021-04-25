import java.util.Scanner;
public class StringCount
{
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a String: ");
		String s = scan.nextLine();
        System.out.println("String Length is: " + stringLen(s));
	} 
	public static int stringLen(String s)
	{
		if (s.equals(""))
			return 0;
		else
			return stringLen(s.substring(1)) + 1;
     }

}