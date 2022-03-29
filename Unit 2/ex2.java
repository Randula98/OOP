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

    public Student(int studentID , String name , int age)
    {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    //methods
    public void displayDetails()
    {
        System.out.println("ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Age : " + this.getAge());
    }

    //setters , mutators
    public void setID(int id)
    {
        studentID = id;
    }

    public void setName(String Sname)
    {
        name = Sname;
    }

    public void setAge(int Sage)
    {
        age = Sage;
    }

    //getters
    public int getID()
    {
        return studentID;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

class Main{
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       Student s2 = new Student(2 , "Jade" , 30);
    
        // s1.setID(1);
        // System.out.println("s1 Object");
        // s1.displayDetails();
        // System.out.println();

       System.out.println("s2 Object");
       s2.displayDetails();

       System.out.println();
       s2.setAge(31);
       s2.displayDetails();

        //System.out.println("Name of Student No.2 : " + s2.getName());
    }
}