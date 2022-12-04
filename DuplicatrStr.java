
public class DuplicatrStr {

	public static void main(String[] args) {
		
		String s1="Programming";
		String s2="";
		
		char [] ar = s1.toCharArray();
		
		for(int i=0; i<ar.length; i++)
		{
			boolean flag = false;
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					flag=true;
					break;
				}
			}
			if(flag == true)
			{
				s2=s2+ar[i];
			}
			
		}
		System.out.println(s2);

	}

}
