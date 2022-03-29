class Student{
	private int ID;
	protected int mark1;
	protected int mark2;
	protected int mark3;
	
	
	public Student(int iD, int mark1, int mark2, int mark3) {
		super();
		ID = iD;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	public void displayDetails()
	{
		System.out.println("ID : " + ID);
		System.out.println(mark1 + " " + mark2 + " "  + mark3);
	}
}

class Calculation{
	
	public static void calcTotal(Student st)
	{
		int total = st.mark1 + st.mark2 + st.mark3;
		System.out.println("Total Marks : " + total);
	}
}

class Main{
	public static void main(String[] args) 
	{
		Student st1 = new Student(1 , 80 , 90 , 90);
		st1.displayDetails();
		Calculation.calcTotal(st1);
	}
}