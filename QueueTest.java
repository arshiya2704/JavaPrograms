import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;
public class QueueTest extends TestCase
{
	queueArray q=new queueArray(10);
	public void testEmpty() 
	{
        assertTrue(q.isEmpty());
	}
	public void testFull() 
	{
        assertTrue(!q.isFull());
	}
	public void testInsert() 
	{
        q.insert(5);
        q.insert(6);
	}
	public void testRemove() 
	{
		q.insert(6);
        q.remove();
	}
	public void testPeek() 
	{
		q.insert(6);
		q.insert(8);
		q.insert(9);
        q.remove();
        assertEquals(8,q.peek());
	}
	public void testSize() 
	{
		q.insert(6);
		q.insert(8);
		q.insert(9);
        q.remove();
        assertEquals(2,q.getSize());
	}
	public void testOverall() 
	{
		q.insert(6);
		q.insert(8);
		q.insert(9);
        q.remove();
        q.remove();
        assertEquals(1,q.getSize());
        assertEquals(9,q.peek());
        assertTrue(!q.isEmpty());
        assertTrue(!q.isFull());
	}
}
