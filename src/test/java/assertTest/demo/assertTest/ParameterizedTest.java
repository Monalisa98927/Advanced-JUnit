package assertTest.demo.assertTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)

public class ParameterizedTest {

	private int number;
	private int expectedResult;
	
	@Parameters
	public static Collection<Object[]> factorialData(){
		return Arrays.asList(new Object[][] {{0,1},{1,1},{2,2},{3,6}});
	}
	
	public ParameterizedTest(int input,int expected) {
		// TODO Auto-generated constructor stub
		number = input;
		expectedResult = expected;
	}
	
	@Test
	public void This_is_a_parameterized_test() throws Exception{
		Factorial f = new Factorial();
		Assert.assertEquals(f.factorial(number), expectedResult);
	}

}
