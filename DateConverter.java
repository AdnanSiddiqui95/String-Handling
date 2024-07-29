public class DateConverter
{
	public static void main(String[] args) 
	{	
		String date="2024-07-29";
		System.out.println("International method of date YYYY-MM-DD:"+ date);
		String[]x=date.split("-");
		date=x[2]+"-"+x[1]+"-"+x[0];
		System.out.println("Converted to Indian Method of date DD-MM-YYYY: "+date);
	}

}
