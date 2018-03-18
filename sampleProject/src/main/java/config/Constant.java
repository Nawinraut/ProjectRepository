package config;

public class Constant {
	 
	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "http://www.store.demoqa.com";
	public static final String Path_TestData = "C://Users//nawkumar//workspace//sampleProject//src//main//java//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "C://Users//nawkumar//workspace//sampleProject//src//main//java//config//OR.properties";
	public static final String File_TestData = "DataEngine.xlsx";
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =3 ;
	public static final int Col_ActionKeyword =4;
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Sheet1";
 
	// List of Test Data
	public static final String UserName = "testuser_3";
	public static final String Password = "Test@123";
 
}