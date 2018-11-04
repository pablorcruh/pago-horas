package ec.com.ioet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ec.com.ioet.model.WorkInfo;
import ec.com.ioet.model.Workload;
import ec.com.ioet.services.ParseService;
import ec.com.ioet.services.ReadInputService;
import ec.com.ioet.services.impl.ParseServiceImpl;
import ec.com.ioet.services.impl.ReadInputServiceImpl;

public class PagosTest {

	String inputData = "MO10:00-12:00";
	
	String inputData1 = "RENE=MO10:00-12:00,TU10:00-12:00";
	
    Workload workload =new Workload("SU","20:00","21:00");
    
	ReadInputService readService=new ReadInputServiceImpl();
	ParseService parseService = new ParseServiceImpl();
	
	@Test
	public void parseInput() {
		Workload result = parseService.parse(inputData);
		assertEquals("MO", result.getDay());
		assertEquals("10:00", result.getStartTime());
		assertEquals("12:00", result.getStopTime());
		
	}
	
	@Test
	public void parseMultipleInput() {
		WorkInfo result = parseService.parseMultipleInput(inputData1);
		assertEquals(2,result.getWorkload().size());
	}
	
	@Test
	public void calculateHours( ) {
		int result = parseService.calculateHours(workload);
		assertEquals(1,result);
		
	}
	
	@Test
	public void chooseTimeLine() {
		int result = parseService.chooseTimeLine(workload);
		assertEquals(25, result);
	}
	

}
