public class interfaces 
{
	public static void main(String[] args) //main method
	{
		Bank b1=new BOFA();  //creating objects for different classes and calling the functions
		System.out.println("ROI for BOFA: "+b1.roi());
		Bank b2=new CITI();  
		System.out.println("ROI for CITI: "+b2.roi());
		Bank b3=new WELLS();  
		System.out.println("ROI for WELLS FARGO: "+b3.roi());
		Bank b4=new CHEST();  
		System.out.println("ROI for CHEST: "+b4.roi());
	}

}
interface Bank //interface
{  
	float roi();  
}  
class BOFA implements Bank //All these classes implement the interface and thus define the method roi() in it as per their need
{  
	public float roi()
	{return 9.15f;}  
}  
class CITI implements Bank
{  
	public float roi()
	{return 9.7f;}  
}  
class WELLS implements Bank
{  
	public float roi()
	{return 9.32f;}  
} 
class CHEST implements Bank
{  
	public float roi()
	{return 9.56f;}  
}  