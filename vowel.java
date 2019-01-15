import java.util.Scanner;
public class vowel{
	public static void main(String[]args){
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char ch = Input.next().charAt(0);
		if (ch == 'a'|| ch == 'A'|| ch == 'e'||ch == 'E'||ch == 'i'||ch == 'I'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U')
		{
			System.out.println("The alphabet is a vowel");
		}
		else
		{
			System.out.println("The alphabet is a consonant");
		}
	}
}