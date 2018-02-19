import java.util.*;
public class generics 
{
	private <G> void swap(G[] a, int i, int j) 
    { //generic swap function to swap the values
        if (i != j) 
        {
            G temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public <G extends Comparable<G>> void selectionSort(G[] a) 
    { //Comparable interface used to order the objects of user-defined class
        for (int i = 0; i < a.length - 1; i++) 
        {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[j].compareTo(a[smallest])<=0) 
                {
                    smallest = j;
                }
            }
            swap(a, i, smallest);  // swap smallest to front by calling the swap function above
        }
    }
    public static void main(String[] args)
    {//main method
        generics sort = new generics(); //declaring an object of class generics
        int i;
        Scanner input = new Scanner(System.in);
        char ch;
	    do
	    {
	    		System.out.println("Choose which you want to sort");
	    		System.out.println("1. Integers");
	    		System.out.println("2. Strings");
	    		System.out.println("3. Characters");
	    		int choice = input.nextInt();
	    		switch(choice) 
	    		{
	    			case 1:
	    			{
	    				System.out.println("Input number of integers to sort");
	    				int num1 = input.nextInt(); //Fetch the input from the console
	    				Integer array1[] = new Integer[num1]; //declaring an array of length as entered by user
	    				System.out.println("Enter " + num1 + " integers");
	    				for (i = 0; i < num1; i++) 
	    					array1[i] = input.nextInt(); //Storing the values entered in an array
	    				System.out.println("Before sorting int: "+ Arrays.toString(array1));
	    				sort.selectionSort(array1);
	    				System.out.println("After sorting int : "+Arrays.toString(array1));
	    			}
	    			break;
	    			case 2:
	    			{
	    				System.out.println("Input number of strings to sort");
	    				int num2 = input.nextInt(); //Fetch the input from the console
	    				String array2[] = new String[num2]; //declaring an array of length as entered by user
	    				System.out.println("Enter " + num2 + " strings ");
	    				for (i = 0; i < num2; i++) 
	    					array2[i] = input.next(); //Storing the values entered in an array
	    				System.out.println("Before sorting Characters: "+ Arrays.toString(array2));
	    				sort.selectionSort(array2);
	    				System.out.println("After sorting Characters : "+Arrays.toString(array2));
	    			}
	    			break;
	    			case 3:
	    			{
	    				System.out.println("Input number of characters to sort");
	    				int num3 = input.nextInt(); //Fetch the input from the console
	    				String array3[] = new String[num3]; //declaring an array of length as entered by user
	    				System.out.println("Enter " + num3 + " characters "); 
	    				for (i = 0; i < num3; i++) 
	    					array3[i] = input.next(); //Storing the values entered in an array
	    				System.out.println("Before sorting Characters: "+ Arrays.toString(array3));
	    				sort.selectionSort(array3);
	    				System.out.println("After sorting Characters : "+Arrays.toString(array3));
	    			}
	    			break;
	    			default : System.out.println("Wrong Entry \n ");
	    			break;
	    		}
	    		System.out.println("\nDo you want to continue(Type y or n)\n");/*to proceed further*/
			ch=input.next().charAt(0);/*charAt(0) in case user types Yes or yes*/
	    }
	    while ((ch=='Y' || ch=='y'));	
    }
}