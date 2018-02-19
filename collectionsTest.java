import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import junit.framework.TestCase;
public class collectionsTest extends TestCase
{
	perform3 coll=new perform3();
	List <Integer> collect = new ArrayList <Integer> ();
	public void testPerform() 
	{
		collect.add(10);
		collect.add(5);
		collect.add(9);
		coll.sort(collect);
	}
}
