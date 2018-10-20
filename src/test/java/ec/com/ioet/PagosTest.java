package ec.com.ioet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import ec.com.ioet.utils.Utils;

public class PagosTest {

	String inputData = "RENE=MO10:00-12:00";
	
	String inputData1 = "RENE=MO10:00-12:00,TU10:00-12:00";
	
	
	@Test
	public void parseInput() {
		String[] result = Utils.parse(inputData);
		assertEquals(4, result.length);
	}
	

}
