package lab1package;

public class Lab1program9
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="Apple";
		//Add the String to itself
		System.out.println(a+a);
		//string builder creation
		StringBuilder s = new StringBuilder(a);
		for(int i=1;i<a.length();i+=2)
		{
			s.setCharAt(i, '#');
			
		}
		System.out.println(s);
		
		//remove duplicate characters from string.
		String b = "amma";
		String c = "";
		for (int i = 0; i < b.length(); i++) 
		{
			if (c.indexOf(b.charAt(i)) == -1) 
			{
				c = c + b.charAt(i);
			}
		}
		System.out.println(c);
		
		
		//change odd characters to  uppercase;
		String d = "Apple";
		String result = "";

		for (int i = 0; i < d.length(); i++)
		{
		    if (i % 2 == 1) 
		    {
		        result += Character.toUpperCase(d.charAt(i));
		    } 
		    else
		    
		    {
		        result += d.charAt(i);
		    }
		}

		System.out.println(result);
	}


		
}


