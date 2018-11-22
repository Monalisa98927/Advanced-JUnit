package assertTest.demo.assertTest;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class OrderedTests {

	@Test
	public void edit() throws Exception{
		System.out.println("Edit executed");      //3
	}
	
	@Test
	public void create() throws Exception{
		System.out.println("Create executed");    //1
	}
	
	@Test
	public void remove() throws Exception{
		System.out.println("Remove executed");     //2
	}
}
