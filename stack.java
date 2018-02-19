import java.util.*;
public class stack 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the sequence");
		Scanner input=new Scanner(System.in);
		String str= input.nextLine();
		check c=new check();
		boolean b= c.Match(str);
		if(b==true)
		{
			System.out.println("Correct");
		}
		else
			System.out.println("Incorrect");
	}
}
class check
{
	public boolean Match(String str) 
	{
		if (str.isEmpty())
        return true;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++)
		{
			char current = str.charAt(i);
			if (current == '{' || current == '[' || current == '(')
			{
				stack.push(current);
			}
			if (current == '}' || current == ']' || current == ')')
			{
				if (stack.isEmpty())
                return false;
				char last = stack.peek();
				if (current == '}' && last == '{' || current == ']' && last == '[' || current == ')' && last == '(')
					stack.pop();
				else 
					return false;
			}
		}
		return stack.isEmpty();
	}
}