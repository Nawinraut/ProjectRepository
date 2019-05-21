package StringPrograms;

import java.util.Scanner;

public class StringReverse {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		String str="Welcome to bangalore";
		
		//System.out.println(reverseString(str));	
		
	//reverser string at same position	
		String[] str2 = str.split(" ");
		for(String st:str2)
		{
			for (int i=st.length()-1;i>=0;i--)
			System.out.print(st.charAt(i));
			System.out.print(" ");
		}
		}
	
	
	//		without recursion

	/*char[] str1 = str.toCharArray();
		for( int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}*/

   //	with recursion
	
	/*public static String reverseString(String str1)
	{
		if (str1.isEmpty())
			return str1;
		else
		   return reverseString(str1.substring(1))+str1.charAt(0);
		
	}*/
	

//	Reverse of the sentence
	/*
	  Scanner input=new Scanner(System.in);
	    String str = input.nextLine();
	    String[] ch = str.split(" ");
	    for( int i=ch.length-1;i>=0;i--)
	    		{
	    	System.out.print(ch[i]+ " ");
	    
	    }
*/
}



