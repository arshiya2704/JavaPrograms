public class multithreading 
{
	public static void main(String[] args) 
	{//main method
		test th1 = new test( "Thread-1");//creating objects of class test and calling start function in that
		th1.start();
		test th2 = new test( "Thread-2");
		th2.start();
	    test th3= new test( "Thread-3");
	    th3.start();
	}

}
class test implements Runnable 
{//Runnable is a pre-defined interface that has a method run() declared i it which will be defined in test class
	   private Thread t;
	   private String threadName; 
	   test( String name) 
	   {//constructor
		   threadName = name;
		   System.out.println("Creating " +  threadName ); //entry point as first the name will be printed for each thread and jumps to start() as called in the main method
	   }
	   public void run() 
	   {
		   System.out.println("Running " +  threadName );
		   try 
		   {
			   for(int i = 1; i <= 5; i++) 
			   {
				   System.out.println("Thread: " + threadName + ", " + i +" time");
				   Thread.sleep(100);//Timed waiting
			   }
		   }
		   catch (InterruptedException e) 
		   {
			   System.out.println("Thread " +  threadName + " interrupted.");
	       }
	       System.out.println("Thread " +  threadName + " exiting.");// after the loop is over 5 times.
	   }
	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );//starting the respective threads
	      if (t == null) 
	      {
	    	  	t = new Thread (this, threadName);
	    	  	t.start ();
	      }
	   }
}