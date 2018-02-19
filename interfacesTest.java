import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
public class interfacesTest extends TestCase
{
	public void testBOFA() 
	{
		BOFA b1=new BOFA();
		b1.roi();
	}
	public void testCITI() 
	{
		CITI b2=new CITI();
		b2.roi();
	}
	public void testWELLS() 
	{
		WELLS b3=new WELLS();
		b3.roi();
	}
	public void testCHEST() 
	{
		CHEST b4=new CHEST();
		b4.roi();
	}
}
