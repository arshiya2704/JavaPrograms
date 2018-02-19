import java.util.*;
public class Array 
{
	public static void main(String[] args)
	{
		int num, i, j, swap;
		char ch;              //declaring the variables
		perform1 obj=new perform1();
		Scanner input = new Scanner(System.in);
		System.out.println("Input number of integers to sort");
		num = input.nextInt(); //Fetch the input from the console
		int array[] = new int[num]; //declaring an array of length as entered by user
		System.out.println("Enter " + num + " integers");
		for (i = 0; i < num; i++) 
			array[i] = input.nextInt(); //Storing the values entered in an array
		do 
		{
	    		System.out.println("1. Ascending Order");
	    		System.out.println("2. Descending Order");
	    		int choice=input.nextInt();
	    		switch(choice) 
	    		{
	    		case 1:
	    		{
	    			int [] arr= obj.ascending(num,array);
	    			System.out.println("Sorted list of numbers");
	    			for (i = 0; i < num; i++) 
	    				System.out.println(arr[i]);	
	    		}
	    		break;
	    		case 2:
	    		{
	    			int arr[]= obj.descending(num,array);
	    			System.out.println("Sorted list of numbers");
	    			for (i = 0; i < num; i++) 
	    			System.out.println(arr[i]);	
	    		}
	    		break;
	    		default:
	    		System.out.println("Wrong Entry \n ");
	    		break;
	    		}
	    		System.out.println("\nDo you want to continue(Type y or n)\n");/*to proceed further*/
	    		ch=input.next().charAt(0);/*charAt(0) in case user types Yes or yes*/
		}
	    while (ch=='Y' || ch=='y');	    
	}
}
class perform1
{
	public int[] ascending(int n, int array[])
	{
		for (int i = 0; i < ( n - 1 ); i++) //For the number of iterations-outer cycles
		{
			for (int j = 1; j < n - i; j++) //Comparison in a single circle until the last element
			{
				if (array[j-1] > array[j]) /* For ascending order use */
				{
					int swap = array[j-1];// swapping using a third variable
					array[j-1]= array[j];
					array[j] = swap;
				}
			}
		}
		return array;	
	}
	public int[] descending(int n, int array[])
	{
		for (int i = 0; i < ( n - 1 ); i++) //For the number of iterations-outer cycles
		{
			for (int j = 0; j < n - i - 1; j++) //Comparison in a single circle until the last element
			{
				if (array[j] < array[j+1]) /* For descending order use */
				{
					int swap = array[j];
					array[j]= array[j+1];// swapping using a third variable
					array[j+1] = swap;
				}
			}
		}
		return array;	
	}
}