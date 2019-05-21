package StringPrograms;

public class ReverseStringAtSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love java";
		String[] str1=str.split(" ");
		for(String s:str1)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
				
			}
			System.out.print(" ");
		}
		
	}

}
