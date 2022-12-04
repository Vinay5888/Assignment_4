
public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		
		String s1 = "Programming";
		String s2="";
		//StringBuilder sb = new StringBuilder();
		char ch[] = s1.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			boolean flag = false;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					flag = true;
					break;
				}
			}
			
			if(flag==false)
			{
				s2=s2+ch[i];
				//sb.append(ch[i]);
			}
		}
		System.out.println(s2);
		
		
	}

}
