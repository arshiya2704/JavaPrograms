import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
public class ArrayTest extends TestCase
{
	perform1 t=new perform1();
	public void testAscending() 
	{
		int arr[]= {5,8,9,4,6};
		t.ascending(5,arr);
	}
	public void testDescending() 
	{
		int arr[]= {5,8,9,4,6};
		t.descending(5,arr);
	}
}
