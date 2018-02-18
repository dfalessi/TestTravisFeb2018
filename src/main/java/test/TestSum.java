package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import logic.LogicCalculator;




public class TestSum {

	@Test
	public void MyTestSum(){
		LogicCalculator test = new LogicCalculator();
		test.sum(10,10);
		assertEquals(20,  test.result, 0);
	}
		
}
