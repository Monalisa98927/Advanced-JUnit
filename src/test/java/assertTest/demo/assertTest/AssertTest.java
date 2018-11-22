package assertTest.demo.assertTest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;

public class AssertTest    
{
    @Test
    public void assertTrue_and_assertFalse_sample() throws Exception{
    	Assert.assertTrue(true);
    	Assert.assertFalse(false);
    }
    
    @Test
    public void assertNull_and_assertNotNull_sample() throws Exception{
    	Object myObject1 = null;
    	Object myObject2 = new String("Hello World!");
    	
    	Assert.assertNull(myObject1);
    	Assert.assertNotNull(myObject2);
    }
    
    @Test
    public void assertEquals_sample() throws Exception{
    	int i = 1;
    	int j = 2;
    	int k = 1;
    	
    	//Assert.assertEquals(i, j);  // failure
    	Assert.assertEquals(i, k);
    }
    
    @Test
    public void asserNotSame_and_assertSame_sample() throws Exception{
    	int i = 1;
    	int j = 1;
    	int k = 2;
    	
    	Assert.assertNotSame(i, k);
    	Assert.assertSame(i, j);
    }
    
    @Test
    public void equalsTo_Matcher() throws Exception{
    	String name = "FangKun";
    	int age = 20;
    	int[] scores = {98,99,96,97};
    	String[] subjects = {"A","B","C","D"};
    	
    	assertThat(name, equalTo("FangKun"));
    	assertThat(age,equalTo(20));
    	assertThat(scores,equalTo(new int[] {98,99,96,97}));
    	assertThat(subjects,equalTo(new String[] {"A","B","C","D"}));    	
    }
    
    @Test
    public void equalTo_Matcher_array_content_same_but_index_not_same() throws Exception{
    	String[] hobbies= {"singing","dancing","shopping"};
    	//assertThat(hobbies,equalTo(new String[] {"shopping","singing","dancing"}));  //failure
    }
        
    @Test
    public void not_Matcher_test_pass_and_fail() throws Exception{
    	int age = 20;
    	assertThat(age,not(equalTo(21)));
    	//assertThat(age,not(equalTo(20)));     //failure
    }
    
    @Test
    public void verify_multiple_values() throws Exception{
    	double pay = 59.90;
    	
    	assertThat(pay,either(equalTo(60.00)).or(equalTo(59.90)));
    	assertThat(pay,both(equalTo(60.00-0.10)).and(equalTo(59.80+0.10)));   
    	assertThat(pay,anyOf(equalTo(60.00),equalTo(58.90),equalTo(59.90)));
    	assertThat(pay,not(anyOf(equalTo(60.00),equalTo(58.90),equalTo(58.80))));
    	assertThat(pay,not(allOf(equalTo(59.80+0.10),equalTo(59.90),equalTo(60.00))));
    }
    
    @Test
    public void verify_collection_values() throws Exception{
    	List<Integer> scores = Arrays.asList(98,97,96,95,94);
    	
    	assertThat(scores,hasItem(95));
    	assertThat(scores,hasItems(98,97));
    	assertThat(scores,not(hasItem(100)));
    }
    
    @Test
    @Ignore 
    public void verify_Strings() throws Exception{
    	String name = "Karlie Fang";
    	
    	assertThat(name,startsWith("Ka"));
    	assertThat(name,endsWith("ng"));
    	assertThat(name,containsString("ie F"));
    }
}
