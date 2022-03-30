class Main{
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("String Pool");
		if(str1 == str2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println();
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("String Obejct");
		if(str3 == str4)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println();
		
		System.out.println("String objects but equals() function");
		if(str3.equals(str4)) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
}