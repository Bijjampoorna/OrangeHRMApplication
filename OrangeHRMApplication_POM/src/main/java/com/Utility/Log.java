package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log 
{

public static Logger logg=Logger.getLogger(Log.class);

public static void info(String message)
{
	
	PropertyConfigurator.configure("./OrangeHRMApplication_POM_LogFiles.properties");
	logg.info(message);
	
	
}
	
}
