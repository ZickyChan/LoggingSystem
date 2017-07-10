/**
 * 
 */
package fr.epita.loggingsystem.launcher;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.epita.loggingsystem.Logger;
import fr.epita.loggingsystem.LoggerConfiguration;

/**
 * @author Zick
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LoggerConfiguration config = new LoggerConfiguration("/temp/application.log");
		Logger logger = new Logger(config);
		
		logger.log("First log");
		logger.log("Second log","INFO");
		
	}

}
