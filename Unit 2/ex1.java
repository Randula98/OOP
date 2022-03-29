class Student{

    //properties
    private int studentID;
    private String name;
    private int age;

    public Student()
    {
        studentID = 0;
        name = "";
        age = 0;
    }

    public Student(int ID , String Sname , int Sage)
    {
        studentID = ID;
        name = Sname;
        age = Sage;
    }

    //methods
    public void displayDetails()
    {
        System.out.println("ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public void setID(int id)
    {
        studentID = id;
    }
}

class Main{
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       Student s2 = new Student(1 , "Jade" , 30);
    
       s1.setID(2);
       System.out.println("s1 Object");
       s1.displayDetails();
       System.out.println();

       System.out.println("s2 Object");
       s2.displayDetails();
    }
}