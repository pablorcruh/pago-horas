package ec.com.ioet.services.impl;

import java.io.BufferedReader;

import ec.com.ioet.services.ReadInputService;

public class ReadInputServiceImpl implements ReadInputService {

	public String readInput(BufferedReader buffer) {
		try {
			String line = "";
			line = buffer.readLine();
			return line;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
