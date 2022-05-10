package Test1;

public class StringArray 
{
  public static void main(String[] args) 
	{
	   String str = "TestNg,java,cucumber,maven";
	   String[] s1= str.split(",");
	   for(String i : s1)
	   {
		   System.out.println(i);
	   }

	}

}
