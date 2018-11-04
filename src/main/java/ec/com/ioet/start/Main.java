package ec.com.ioet.start;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.services.ParseService;
import ec.com.ioet.services.ReadInputService;
import ec.com.ioet.services.impl.ParseServiceImpl;
import ec.com.ioet.services.impl.ReadInputServiceImpl;

public class Main {

	public static void main(String[] args) throws IOException {
		// mvn exec:java -Dexec.mainClass="ec.com.ioet.start.Main" -Dexec.args="input.txt"
		
		ReadInputService readService=new ReadInputServiceImpl();
		ParseService parseService = new ParseServiceImpl();
		
		String input = args[0];
		BufferedReader bufferReader = new BufferedReader(new FileReader(input));
		WorkInfo workInfo = new WorkInfo();
		
		try {
			String workInput = readService.readInput(bufferReader);
			workInfo = parseService.parseMultipleInput(workInput);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bufferReader.close();
		}
	}

}
