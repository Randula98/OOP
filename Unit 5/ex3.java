class Main{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to SLIIT");
		System.out.println("Original : " + sb);
		
		sb.reverse();
		System.out.println("Reversed : " + sb);
		
		System.out.println();
		
		System.out.println("Append");
		StringBuilder sb1 = new StringBuilder("Entry : ");
		System.out.println("Before Modification - "  +sb1);
		
		for(int i = 0 ; i < 5 ; i++)
		{
			sb1.append("abc ");
		}
		System.out.println("After Modification - "  +sb1);
		
		System.out.println();
		
		System.out.println("Insert");
		StringBuilder sb2 = new StringBuilder("ABCD");
		StringBuilder sb3 = new StringBuilder("ABCD");
		
		System.out.println("Before Modification : " + sb2);
		
		System.out.println();
		System.out.println("After Modification");
		sb2.insert(2, "xyz");
		System.out.println(sb2);
		
		sb3.insert(1, "xyz");
		System.out.println(sb3);
		
		
		
	}
	
}