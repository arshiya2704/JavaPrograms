import java.util.*;
public class TOH {
	public static int N;
    public static Stack<Integer>[] tower = new Stack[4]; // declaring an array of Stack predefined class in package java.util.*
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        tower[1] = new Stack<Integer>();//defining the 3 towers
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();        
        System.out.println("Enter number of disks");
        int num = input.nextInt();// fetching the input from console regarding the number of disks
        N = num;
        //perform t=new perform();
        toh(num);//calling the function to perform tower of hanoi
    }


    public static void toh(int n)
    {
        for (int d = n; d > 0; d--)
            tower[1].push(d);//pushing the disks in first tower starting from largest and ending at smallest since the loop is in a decrement fashion
        display(); //display the initial states
        move(n, 1, 2, 3);  // call the move function to move the disks to last tower       
    }
    public static void move(int n, int a, int b, int c)// n are the number of disks whereas a,b,c are the towers 1,2,3 respectively
    {
        if (n > 0)
        {
            move(n-1, a, c, b); // recursive functions algorithm to move to next step unless the disks are transferred to the last tower    
            int d = tower[a].pop();                                             
            tower[c].push(d); // moving the smallest uppermost disk to the last tower
            display();                   
            move(n-1, b, a, c);     
        }         
    }
    public static void display() // to display the situation after each move
    {
        System.out.println("  Tower1  |  Tower2  |  Tower3");
        System.out.println("--------------------------------");
        for(int i = N - 1; i >= 0; i--)
        {
            String d1 = " ", d2 = " ", d3 = " ";//initializing the strings to store values of respective towers
            try
            {
                d1 = String.valueOf(tower[1].get(i));
            }
            catch (Exception e){
            }    
            try
            {
                d2 = String.valueOf(tower[2].get(i));
            }
            catch(Exception e){
            }
            try
            {
                d3 = String.valueOf(tower[3].get(i));
            }
            catch (Exception e){
            }
            System.out.println("     "+d1+"    |   "+d2+"       |  "+d3);
        }
        System.out.println("\n");

	}

}
