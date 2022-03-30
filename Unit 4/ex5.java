class Main{
	public static void main(String[] args) 
	{
		String text = "123";
		
		int number = 50;
		
		int data[] = new int[5];
		
		try {
			System.out.println("Try Statement");
			
			int value = Integer.parseInt(text);
			
			int answer = number / 2;
			
			data[10] = 50;
					
			System.out.println(value);
			
			System.out.println(answer);			
			
		}
		catch(NumberFormatException e)
		
		{
			System.out.println("String contaings Letters of Symbols");
			System.out.println("Only should contain numbers");
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Number is divided by 0");
			System.out.println("Answer is not valid since its infitine");
		}
	
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Other error found");
		}
		
		finally 
		{
			System.out.println("Finally");
		}
	}
}