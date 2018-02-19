import java.util.*;
public class collections 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integers");
	    num = input.nextInt(); //fetching the input from the console
	    List <Integer> collection = new ArrayList<Integer>();//declaring the collection
        System.out.println("Enter the integers");
        int array[] = new int[num];
        for(int i=0;i<num;i++) 
        {
        		array[i] = input.nextInt();// storing the integers in an array
        		collection.add(array[i]);// adding the array elements onto collection
        }
	    perform3 p=new perform3();
	    p.sort(collection);
	}
}
class perform3
{
	public void sort(List<Integer> coll) 
	{
		System.out.println("Current order in Collection : " + coll);
        Collections.sort(coll, Collections.reverseOrder()); // reversing the array using collections.sort
        System.out.println("Sorted on Reverse order in Collection : {}"+ coll);
	}
}

