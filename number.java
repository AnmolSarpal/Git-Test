import java.util.Scanner;
public class number{
	public static void main(String[]args){
		int flag=-1,number,num,elements[]=new int[10];
		Scanner Input=new Scanner (System.in);
		System.out.println("Enter the numbers");
		for(number=0; number<10; number++)
		{
			elements[number] = Input.nextInt();
		}
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
}