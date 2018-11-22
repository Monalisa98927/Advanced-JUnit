package assertTest.demo.assertTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FactorialParameterizedTest {

	@Test
	@Parameters(source = FactorialDataProvider.class)
	public void factorial_test(int number,int expectedResult) throws Exception{
		Factorial f = new Factorial();
		Assert.assertEquals(f.factorial(number), expectedResult);
	}
}
