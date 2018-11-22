package assertTest.demo.assertTest;

import org.junit.*;
import static org.junit.Assert.assertThat;
import static assertTest.demo.assertTest.LessThanOrEqual.lessThanOrEqual;

public class AssertThatBuildInMatchers {

	@Test
	public void lessthanOrEqual_custom_matcher() throws Exception{
		int actual1 = 99;
		double actual2 = 59.90;
		String actual3 = "Karlie Fang";
		
		assertThat(actual1,lessThanOrEqual(100));
		assertThat(actual2,lessThanOrEqual(60.00));
		assertThat(actual2,lessThanOrEqual(59.9001));
		assertThat(actual3,lessThanOrEqual("Karlie Fang "));
		assertThat(actual3,lessThanOrEqual("hkgj"));     // ???true
	}
	
	@Test
	public void compare_with_Maximum_and_Minimal_Value() throws Exception{
		int actual_max = Integer.MAX_VALUE - 1;
		int actual_min = Integer.MIN_VALUE;
		
		assertThat(actual_max,lessThanOrEqual(Integer.MAX_VALUE));
		assertThat(actual_min,lessThanOrEqual(Integer.MIN_VALUE));
	}
}
