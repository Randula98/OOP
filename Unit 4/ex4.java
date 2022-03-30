class Main{
	public static void main(String[] args) 
	{
		int value = 50;
		
		try 
		{
			System.out.println("Try Statement");
			int number = value / 0;
			System.out.println(number);
			
			System.out.println("End of Try");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Error Found");
		}
		finally 
		{
			System.out.println();
			System.out.println("Finally Block");
		}
		
		//int number = value / 0;
		
		System.out.println("End of program");
	}
}