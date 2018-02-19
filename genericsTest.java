import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
public class genericsTest extends TestCase
{
	generics g=new generics();
	public void testSelectionSortInt() 
	{
		Integer array1[]= {8,9,3,4,7};
		g.selectionSort(array1);
		
	}
	public void testSelectionSortStr() 
	{
		String array2[]= {"abc","fgh","wes"};
		g.selectionSort(array2);
		
	}
	public void testSelectionSortchar() 
	{
		String array3[]= {"c","h","e"};
		g.selectionSort(array3);
		
	}

}
