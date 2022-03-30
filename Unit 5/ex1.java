class Main{
	public static void main(String[] args) 
	{
		String first = "Tooth";
		System.out.println(first);
		
		first = "Tooth" + " Fairy ";
		System.out.println(first);
		
		String second = first + 5 + 5;
		
		System.out.println(second);	
		
		String third = first + (5 + 5);
		
		System.out.println(third);
	}
}