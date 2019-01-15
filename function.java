import java.util.Scanner;
class function{	
	int flag=-1,number,num,elements[]=new int[10],Checkelements,Enterelements;
	Scanner Input=new Scanner (System.in);
	void Enterelements();{
		System.out.println(" Enter the numbers");
		for(number=0; number<10; number++)
		{
			elements[number] = Input.nextInt();
		}
	}
	void Checkelements();{
		System.out.println("Enter the number you want to find");
		num = Input.nextInt();
		for (number=0; number<10; number++)
		{
			if(elements[number] == num)
			{
				flag = 1;
				break;
			}
			else
			{
				flag = -1;
			}
		}
			if(flag == 1)
			{
				System.out.println("The following number is in the array");
				
			}
			else
			{
				System.out.println("The following number entered is not in the array");
				
			}
		}
			public static void main(String[]args)
			{
				function ele= new function();
				ele.Enterelements();
				ele.Checkelements();
			}
}