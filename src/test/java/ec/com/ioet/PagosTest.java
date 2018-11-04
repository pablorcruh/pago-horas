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
	
    Workload workload =new Workload("SU","20:00","21:00");
	
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
		int result = Utils.calculateHours(workload);
		assertEquals(1,result);
		
	}
	
	@Test
	public void chooseTimeLine() {
		int result = Utils.chooseTimeLine(workload);
		assertEquals(25, result);
	}
	

}
