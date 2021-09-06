import java.util.Scanner;
class  Restaurant
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		String[] items=new String[]{"Dal Khichadi","Pav Bhaji","Veg Pulav","Veg Biryani"};
		int[] amount=new int[]{120,90,150,140};
		boolean none=true;

		System.out.println("------------------------------------------------------");
		System.out.println("item"+"\t\t\tamount");
		System.out.println("------------------------------------------------------");
		for(int i=0;i<items.length;i++)
		{
			System.out.println((i+1)+"."+items[i]+"\t\t"+amount[i]);
		}
		System.out.println("------------------------------------------------------");
		
		int sum=0;
		do
		{
			System.out.print("\nSelect what do you want: ");
			int ch=sc.nextInt(); 
			if(ch>=1 && ch<=4)
			{
				sum=sum+amount[ch-1];
				System.out.println("You selected "+items[ch-1]+" item successfully..!!");
				System.out.println("\nDo you want one more item?? \t1.Yes \t2.No");
				int p=sc.nextInt();
				if(p==1)
				{
					none=true;
				}
				else
				{
					none=false;
				}
			}
			else
			{
				System.out.println("Select right choice..!!");
				none=true;
			}
		}while(none);

		System.out.println("------------------------------------------------------");
		System.out.println(" Your total bill is Rs."+sum);
		System.out.println("------------------------------------------------------");
		System.out.println(" Your order is received successfully..!!");
		System.out.println("------------------------------------------------------");
	}
}