package executionEngine;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import config.ActionKeywords;
import config.Constant;
import utility.ExcelUtils;

public class DriverScript {
	public static ActionKeywords actionKeywords;
	public static String sActionKeyword;
	public static Method method[];
	public static String sPageObject;
	public static Properties OR;
	
	//Here we are instantiating a new object of class 'ActionKeywords'
	public DriverScript() throws NoSuchMethodException, SecurityException{
		actionKeywords = new ActionKeywords();
		method = actionKeywords.getClass().getMethods();
	}
	public static void main(String args[]) throws Exception
	{
		String path=Constant.Path_TestData;
		ExcelUtils.setExcelFile(path, Constant.Sheet_TestSteps);
		String Path_OR = Constant.Path_OR;
		FileInputStream fs = new FileInputStream(Path_OR);
		OR= new Properties(System.getProperties());
		OR.load(fs);
		
		DriverScript ds = new DriverScript();
		
		for (int iRow = 1;iRow <= 9;iRow++){
		    //This to get the value of column Action Keyword from the excel
    		sActionKeyword = ExcelUtils.getCellData(iRow, Constant.Col_ActionKeyword);
    		sPageObject = ExcelUtils.getCellData(iRow, Constant.Col_PageObject);
            //A new separate method is created with the name 'execute_Actions'
			//You will find this method below of the this test
			//So this statement is doing nothing but calling that piece of code to execute
    		execute_Actions();
    		}
    	}
	  private static void execute_Actions() throws Exception {
			
		//This is a loop which will run for the number of actions in the Action Keyword class 
			//method variable contain all the method and method.length returns the total number of methods
			for(int i = 0;i < method.length;i++){
				//This is now comparing the method name with the ActionKeyword value got from excel
				if(method[i].getName().equals(sActionKeyword)){
					//In case of match found, it will execute the matched method
					method[i].invoke(sPageObject, sActionKeyword);
					//Once any method is executed, this break statement will take the flow outside of for loop
					break;
				}
			}
		}
}
