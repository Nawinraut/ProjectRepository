package StringPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		String str = input.nextLine();
		String original=str;
		String rev="";
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		 rev=rev+ch[i];
		}
		//System.out.println(rev);
		//System.out.println(original);
		if(rev.equals(original))
		{
		System.out.println("String is palindrom");
		}else{
		System.out.println("String is not palindrom");
		}
	}

}
