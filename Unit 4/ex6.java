class MathOp{
	public int add(int a , int b)
	{
		return a + b;	
	}
	
	public double divide(int a , int b)
	{
		try {
			double answer = a / b;
			return answer;
		}
		catch (ArithmeticException e)
		{
			double answer = 1000;
			return answer;
		}
		catch (Exception e)
		{
			double answer = 500;
			return answer;
		}
	}
}

class Main{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		MathOp math = new MathOp();
		
		System.out.print("Enter number 1 : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter number 2 : ");
		int num2 = scan.nextInt();
		
		
		double answer = math.divide(num1, num2);
		
		System.out.println("Answer : " + answer);
	}
}