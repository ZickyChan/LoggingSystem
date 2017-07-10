package fr.epita.loggingsystem;

import java.io.File;
import java.io.IOException;

public class LoggerConfiguration {
	private File file;
	
	public LoggerConfiguration(String f){
		this.file = new File(f);
		
		//If the path does not exist
		if(!file.exists()){
			//Create directory structure
			file.getParentFile().mkdirs();
			
			//Create the new file
			try {
				//	risky operation
				file.createNewFile();
			} catch (IOException e) {
				// print error message
				e.printStackTrace();
			}
		}
	}

	/**
	 * @return the path
	 */
	public File getFile() {
		return file;
	}
}
