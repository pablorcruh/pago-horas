package ec.com.ioet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.model.Workload;
import ec.com.ioet.utils.Utils;

public class PagosTest {

	String inputData = "MO10:00-12:00";
	
	String inputData1 = "RENE=MO10:00-12:00,TU10:00-12:00";
	String hour1 = "10:00";
    String hour2 = "12:00";
    
    String hour3 = "01:00";
    String hour4 = "03:00";
    
    String hour5 = "14:00";
    String hour6 = "18:00";
    
    String hour7 = "20:00";
    String hour8 = "21:00";
    
    
	
	@Test
	public void parseInput() {
		Workload result = Utils.parse(inputData);
		assertEquals("MO", result.getDay());
		assertEquals("10:00", result.getStartTime());
		assertEquals("12:00", result.getStopTime());
		
	}
	
	@Test
	public void parseMultipleInput() {
		WorkInfo result = Utils.parseMultipleInput(inputData1);
		assertEquals(2,result.getWorkload().size());
	}
	
	@Test
	public void calculateHours( ) {
		int result = Utils.calculateHours(hour5, hour6);
		assertEquals(4,result);
		
	}
	
	@Test
	public void chooseTimeLine() {
		String result = Utils.chooseTimeLine(hour7, hour8);
		assertEquals("Franja 3", result);
	}
	

}
