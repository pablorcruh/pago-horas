package ec.com.ioet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.utils.Utils;

public class PagosTest {

	String inputData = "RENE=MO10:00-12:00";
	
	String inputData1 = "RENE=MO10:00-12:00,TU10:00-12:00";
	
	
	@Test
	public void parseInput() {
		WorkInfo result = Utils.parse(inputData);
		assertEquals("RENE", result.getName());
		assertEquals("MO", result.getWorkload().get(0).getDay());
		assertEquals("10:00", result.getWorkload().get(0).getStartTime());
		assertEquals("12:00", result.getWorkload().get(0).getStopTime());
		
	}
	
	
	

}
