class Calculation{
	public static void total(int num1 , int num2)
	{
		int total = num1 + num2;
		System.out.println("Total : " + total);
		System.out.println();
	}
	
	public static void total(int num1 , int num2 , int num3)
	{
		int total = num1 + num2 + num3;
		System.out.println("Total : " + total);
		System.out.println();
	}
}

class Main
{
	public static void main(String[] args) {
		Calculation.total(5, 10);
		Calculation.total(5 , 10 , 15);
	}
}