import java.util.Scanner;

public class ConsonantInString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter the String :");
		String s1=sc.nextLine();
		
		s1=s1.toLowerCase();
		
		int vowels=0, consonant=0, digit=0, space=0, specialchar=0;
		
		
		
		for (int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				++vowels;
			}
			else if (ch>'a' && ch<='z')
			{
				++consonant;
			}
			else if (ch>='0' && ch<='9')
			{
				++digit;
			}
			else if(ch==' ')
			{
				++space;
			}
			else
			{
				++specialchar;
			}
		}
		
		
		System.out.println("Number of vowels is :"+vowels);
		System.out.println("Number of Consonant is :"+consonant);
		System.out.println("Number of Digits is :"+digit);
		System.out.println("Number of Spaces is :"+space);
		System.out.println("Number of Specialchart is :"+specialchar);

	}

}
