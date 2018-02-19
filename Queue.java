import java.util.*;
public class Queue 
{
	public static void main(String[] args) {/*main method*/
	Scanner input=new Scanner(System.in);/*defining a variable to fetch the input from console*/
	System.out.println("Enter size of Queue");
	int num=input.nextInt();
	queueArray a= new queueArray(num); /*defining an object of class queueArray*/
	char ch;
	do/*using do-while so that it runs atleast once*/
	{
		System.out.println("\nChoose the Operation that you want to perform");/*choices in the menu*/
		System.out.println("1. Insert");
		System.out.println("2. Remove");
		System.out.println("3. Peek");
		System.out.println("4. Check Empty");
		System.out.println("5. Check full");
		int choice=input.nextInt();/*fetching the input from console to variable choice*/
		switch(choice)/*use switch cases as we have more than 3 options of blocks of code to be executed*/
		{
			case 1:
			System.out.println("Enter the element you want to insert");
			try
			{
				a.insert(input.nextInt());/*calling the function by passing parameter entered from console*/
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e.getMessage());
			}
			break;
			case 2:
			try
			{
				System.out.println("Removed Element= "+a.remove());
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e.getMessage());
			}
			break;
			case 3 : 
			try
			{
				System.out.println("Peek Element= "+a.peek());
             }
             catch(Exception e)
             {
            	 	System.out.println("Error: "+e.getMessage());
             }
             break;                            
			case 4 : 
				System.out.println("Empty status= "+a.isEmpty());
             break;                
            	case 5 : 
                System.out.println("Full status= "+a.isFull());
             break;                          
            	case 6 : 
                System.out.println("Size= "+ a.getSize());
             break;                         
            	default : System.out.println("Wrong Entry \n ");
             break;
		}
			a.display();/*Displays the result as per choice*/
			System.out.println("\nDo you want to continue(Type y or n)\n");/*to proceed further*/
			ch=input.next().charAt(0);/*charAt(0) in case user types Yes or yes*/
		}
		while (ch=='Y' || ch=='y');	
	}
}
class queueArray
{
	protected int queue[];
	protected int front,rear,size,length;
	public queueArray(int num)/*constructor*/
	{
		size=num;
		length=0;
		queue=new int[size];
		front=-1;//initializing the variables
		rear=-1;
	}
	public boolean isEmpty()/*checks if the queue is empty and returns a boolean value*/
	{
		return front==-1;
	}
	public boolean isFull() //checks if the queue is full
    {
        return front==0 && rear==size -1 ;
    }    
    public int getSize()// returns the length of the queue
    {
        return length ;
    }    
    public int peek() // returns the element on the top of the queue
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return queue[front];
    }    
    public void insert(int i) //inserts the entered element from the console into the queue
    {
        if (rear == -1) //if empty
        {
            front = 0;
            rear = 0;
            queue[rear] = i;
        }
        else if (rear + 1 >= size)// if full
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size) //optimal situation
            queue[++rear] = i;    
        length++ ;    
    }    
    public int remove() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        else 
        {
            length-- ;
            int elem = queue[front];//storing the head element in a variable to remove it
            if ( front == rear) //if only one element
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return elem;
        }        
    }
    public void display()//displays the result after calling each function as defined in do-while loop above
    {
        System.out.print("\nQueue = ");
        if (length == 0)// if empty
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)//otherwise display the elements of the queue
            System.out.print(queue[i]+" ");
        System.out.println();        
    }

 }
