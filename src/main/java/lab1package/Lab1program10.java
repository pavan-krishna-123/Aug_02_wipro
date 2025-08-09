package lab1package;

public class Lab1program10
{
		public static boolean PositiveString(String temp)
		{
			for(int i=0;i<temp.length()-1;i++)
			{
				if(temp.charAt(i)>temp.charAt(i+1))
				{
					return false;
				}

			}
			return true;
		}

		public static void main(String[] args) 
	    {
		        String a = "AAa";
		        String b = "Aaaaab";
		        String c = "ABCDEF";

		        System.out.println(PositiveString(a));
		        System.out.println(PositiveString(b));
		        System.out.println(PositiveString(c));
		 }

}
