import java.util.Scanner;


public class vowels
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character:");
	char x=s.next().charAt(0);
	if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U')
	{
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Consonant");
		
	}
}
}
