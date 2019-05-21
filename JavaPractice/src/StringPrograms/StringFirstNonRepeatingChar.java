package StringPrograms;

public class StringFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ajajva";
		char[] d=new char[5];
		StringBuilder s=new StringBuilder();
		char[] str1 = str.toCharArray();
		int c=1;
		int k=0;
		for(int i=0;i<=str1.length-1;i++)
		{
			
			for(int j=i+1;j<=str1.length-1;j++)
			{
				if ((str1[i])==(str1[j]))
				{
					c=c+1;
					str1[j]='0';
				}
				
			}
			if(str1[i]!='0' && c==1)
			{
				d[k]=str1[i];
			    s.append(str1[i]);
			    k++;
			}
			else
			c=1;
		}
		System.out.println(d[0]);
		System.out.println( s.charAt(0));
	}

}
