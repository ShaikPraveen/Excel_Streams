package com.Log4J.Mail;

import org.apache.log4j.Logger;

public class TestLog4J extends SecureSMTPAppender
{
	//You want to generate logs, You need to add log4l.xml file under src folder
	//This Project Files log4j.xml and log4j.logs and log.html

	static Logger log=Logger.getLogger(TestLog4J.class);
	public static void main(String[] args) 
	{
		log.debug("This is debug Log");
		log.info("This is info Log");
		log.error("This is error Log");
	}

}
