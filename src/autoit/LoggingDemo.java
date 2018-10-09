package autoit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingDemo {

	public Logger log = Logger.getLogger(LoggingDemo.class);

	public void LoggerDebug() {

		System.out.println("This is a logger debug demo file");
	}

	public void LoggerInfo () {
		System.out.println("This is infor method for logger");

	}

	public void LoggerError () {

		System.out.println("This is loger for error method");
	}

	public void LoggerWarn() {
		System.out.println("This a loggerwarn method");

	}

	public void LoggerFatal() {
		System.out.println("This a loggerfatal method");

	}



	@Test
	public void LoggingDemo () {

		LoggerDebug();
		LoggerInfo();
		LoggerError();
		LoggerWarn();
		LoggerFatal();
	}

}
