package fr.epita.loggingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private PrintWriter writer;
	private LoggerConfiguration config;
	
	public Logger(LoggerConfiguration c) throws FileNotFoundException{
		this.config = c;
		this.writer = new PrintWriter(this.config.getFile());
	}
	
	public void log(String m){
		if(this.writer != null){
			Date date = new Date();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
			
			this.writer.println(simpleFormat.format(date) + " : " + m);
			this.writer.flush();
		}
	}
	public void log(String m, String lvl){
		this.log(lvl + " : " + m);
		
	}
}
