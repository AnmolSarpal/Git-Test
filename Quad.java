import java.util.Scanner;
public class Quad{

	public static void main(String[]args){
		Scanner Input=new Scanner(System.in);
	System.out.println("Enter the values of the coefficient of the quadratic equation");
	int a = Input.nextInt();
	int b = Input.nextInt();
	int c = Input.nextInt();
	double result = b*b - 4.0 * a * c;
       if (result > 0.0){
       double r1 =(-b + Math.sqrt(result)) / (2.0 * a);
       double r2 =(-b - Math.sqrt(result)) / (2.0 * a);
       System.out.println("The roots of the equation =" + r1 + "and" + r2);
             }
             else if (result == 0.0){
             	double r1 = b / (2.0 * a);
             	System.out.println("The roots of the following equation are =" + r1);

             }
             else{
             	System.out.println("The equation has no real roots");
             }
        }  
 } 