import java.util.Scanner;

public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = scan.nextInt();
		for(int i=0; i<a;i++)
		{
			System.out.print(2*i+1+" ");			
		}
	}
}