public class String3
{
	public static void main(String[] args) 
	{
		String str="ADNAN";
		int x=str.length();
		for(int r=0;r<x;r++)
		{
			for(int c=0;c<=r;c++)
			{
				
				System.out.print(str.charAt(c));
			}
			System.out.println();
		}
	}

}
