package StringPrograms;

public class SwapString {

	public static void main(String args[])
	{
		String s1="Nawin";
		String s2="Kumar";
        //Swapping starts
        
        s1 = s1 + s2;
        
        s2 = s1.substring(0, s1.length()-s2.length());
        System.out.println("s2 : "+s2); 
        s1 = s1.substring(s2.length());
         
        //Swapping ends
         
        System.out.println("After Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
	}
	
}
