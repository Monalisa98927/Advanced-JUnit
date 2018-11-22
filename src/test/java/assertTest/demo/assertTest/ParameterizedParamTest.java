package assertTest.demo.assertTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParameterizedParamTest {

	@Parameter(value=0)
	public int number;
	
	@Parameter(value=1)
	public int expectedResult;
	
	@Parameters(name="{index}:factorial({0})= {1}")
	public static Collection<Object[]> factorialData(){
		return Arrays.asList(new Object[][] {{0,1},{1,1},{2,2},{3,6}});
	}
	
	@Test
	public void factorial() throws Exception{
		Factorial f = new Factorial();
		Assert.assertEquals(f.factorial(number), expectedResult);
	}
	
}
