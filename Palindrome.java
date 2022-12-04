import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the string value :");
		String s1=sc.next();
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		
		if(s1.equals(s2))
		{
			System.out.println(s2+" Is Palindrome String");
		}
		else
		{
			System.out.println(s2+" Is not a Palindrome String");
		}

	}

}
