import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
public class multithreadingTest extends TestCase
{
	test t1=new test("arshiya");
	test t2=new test("asim");
	test t3=new test("arshii");
	public void testStart() 
	{
		t1.start();
		t2.start();
		t3.start();
	}
	public void testRun() 
	{
		t1.run();
		t2.run();
		t3.run();
	}

}
