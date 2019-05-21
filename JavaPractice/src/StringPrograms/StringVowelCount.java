package StringPrograms;



public class StringVowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] vow={'a','e','i','o','u'};
		String str="hello welcome";
		String[] str1 = str.split(" ");
		//char[] ch = str.toCharArray();
		int count=0;
		int Strlen=0;
		for(String s:str1)
		{
		char[] ch = s.toCharArray();
		for(char c:ch)
		{
			for(int i=0;i<vow.length;i++)
			{
				if (c==vow[i])
				{
					count++;
				}
			}
		}
		 Strlen=Strlen+s.length();
	
		}
		System.out.println("count of vowel is "+count+" consonent count is  "+(Strlen-count));
	}
}	

