import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		
		int arr[] =new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		for(int i=1; i<=9; i++)
		{
			int count =0;
			for(int j=0; j<=arr.length-1; j++)
			{
				if(arr[j]%i==0)
				{
					count++;
				}
			}
			System.out.print(i+ ":"+ count+", ");
		}
	}
}