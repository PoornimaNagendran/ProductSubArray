import java.util.Scanner;
public class ProductSubArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int sum=0;
		System.out.println("Enter the elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]>0)
			{
				sum=sum+a[j];
			}
		}
System.out.println("The result is "+sum);
	}

}
