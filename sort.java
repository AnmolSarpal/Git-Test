import java.util.Scanner;
class sort{
	public static void main(String[]args){
		Scanner Input=new Scanner(System.in);
		int l1,l2,i,j,k,arr3;
		System.out.println("Enter the sizes of the arrays");
		int l1=scan.nextInt();
		int l2=scan.nextInt();
		int arr1[]=new Int[l1], arr2[]=new int[l2];
		System.out.println("Enter the elements of the array");
		for(int count=0;count<=l1;++count)
			{
				arr1[count]=scan.nextInt();
			}
			for(int count=0;count<=l2;++count)
			{
				arr2[count]=scan.nextInt();
			}
			while(i<arr1.length && j<arr2.length)
			{
				if(arr1[i]<arr2[j])
				{
					arr3[k]=arr1[i];
					++i;
				}
				else
				{
					arr3[k]=arr2[j];
					++j;
				}
				++k;
			}
			while(k<=i+j)
			{
				if(li<l2)
				{
					arr3[k]=arr1[i];
				}
				else
				{
					arr3[k]=arr2[j];
				}
			}
			System.out.println("The array is as following");
			for(int count=0;count<=l1+l2;++count)
			{
				System.out.println(+arr3[count]+"\t");
			}
	}
}