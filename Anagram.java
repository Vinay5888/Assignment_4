import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1;
		String s2;
		System.out.println("Enter String 1 :");
		s1=sc.next();
		System.out.println("Enter String 2 :");
		s2=sc.next();
	    
	    char c1[] =s1.toCharArray();
	    char c2[] =s2.toCharArray();
	    
	    if(c1.length != c2.length)
	    {
	    	System.out.println("Not a Anagram");
	    	System.exit(0);
	    }
	    
	    
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    
	    boolean flag = false;
	    
	    for(int i=0; i<c1.length; i++)
	    {
	    	if(c1[i] != c2[i])
	    	{
	    		flag = true;
	    		break;
	    	}
	    }
	    if(flag==true)
	    {
	    	System.out.println("It is not a Anagram");
	    }
	    else
	    {
	    	System.out.println("It is Anagaram");
	    }
	    

	}

}
