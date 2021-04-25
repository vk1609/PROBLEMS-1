import java.util.Scanner;
class SmallestNumber 
{
	public static int getSmallest(int[] a,int n)
	{
		int temp;
		for(int i = 0; i <n-1; i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }
			}
		}
		return a[0];
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}		
		System.out.println("Smallest number in an array is:"+getSmallest(array,n));
	}
}