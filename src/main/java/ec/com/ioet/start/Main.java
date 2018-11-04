package ec.com.ioet.start;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ec.com.ioet.services.ReadInputService;
import ec.com.ioet.services.impl.ReadInputServiceImpl;

public class Main {

	public static void main(String[] args) throws IOException {
		// mvn exec:java -Dexec.mainClass="ec.com.ioet.start.Main" -Dexec.args="input.txt"
		
		ReadInputService service=new ReadInputServiceImpl();
		
		String input = args[0];
		BufferedReader bufferReader = new BufferedReader(new FileReader(input));

		
		try {
			System.out.println(">>>>>>>>>>"+service.readInput(bufferReader));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bufferReader.close();
		}
	}

}
