package StringPrograms;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class StringOrderMatching {

	  // Driver method to test below methods
    public static void main(String[] args){             

	    String s1="nawin";
	    String ss="inn";
	    System.out.println((s1+s1).contains(ss));
}
}






/*
  	



/*String str  ="nawin";

char[] str1 = str.toCharArray();
String sbstr="niw";
char[] sbstr1 = sbstr.toCharArray();
int len = str.length();
int sblen = sbstr.length();
int i=0;
int k=0;
boolean flag = false;
for(i=0;i<sblen;i++)
{
	for(int j=0;j<=len;j++)
	{
	if (sbstr1[i]==str1[j])
	{
		if(j<=len-1)
		{
		  System.out.println(sbstr1[i] + " index "+ i+"  equal to "+str1[j]+" index "+ j);
		  i++;
		  k=k+1;
		  if(k==sblen)
		  {
			  break;
		  }
		  if(j==len-1)
		  {
			  j=-1;
		  }
		}				
	}
}
}
if  (k==sblen)
{
	System.out.println("match found.");
}
else
{
	System.out.println("No match found.");
}
*/


//if(str.regionMatches(i, sbstr, 0, sblen))