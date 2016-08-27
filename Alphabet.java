import java.util.Scanner;


public class Alphabet 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value");
	char c=s.next().charAt(0);
	if(Character.isAlphabetic(c))
	{
		System.out.println("Alphabet");
	}
	else
	{
		System.out.println("Not Alphabet");
	}
	
}
}
