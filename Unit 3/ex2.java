class Student{
    private int ID;
    private String name;
    private static String course;

    public Student(int ID , String name){
        this.ID = ID;
        this.name = name;
    }

    public void printDetails(){
        System.out.println("ID : " + ID);
        System.out.println("Name : " + name);
        System.out.println("Course : " +course);
        System.out.println();
    }

    public void setCourse(String mCourse){
        course = mCourse;
    } 
    
    public static void Hello()
    {
    	System.out.println("Hello World");
    }
    
    public static void showCourse()
    {
    	System.out.println("Course : " + course);
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(1, "Smith");
        Student s2 = new Student(2, "Nick");

        s1.setCourse("SE");

        System.out.println("Student 1");
        s1.printDetails();
        
        System.out.println("Student 2");
        s2.printDetails();
        
        Student.showCourse();
    }
}