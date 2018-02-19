import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
public class stackTest extends TestCase
{
	check exp=new check();
	public void test1() 
	{
		exp.Match("[({{}})]");
	}
	public void test2() 
	{
		exp.Match("[({}})]");
	}
	public void test3() 
	{
		exp.Match(")");
	}
	public void test4() 
	{
		exp.Match("abc");
	}
}
