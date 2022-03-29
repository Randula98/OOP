class Shape{
    //attributes
    protected String name;

    //methods
    public Shape(String name)
    {
        this.name = name;
    }

    public void printName()
    {
        System.out.println("Name : " + this.name);
    }

    public int calcArea()
    {
        return 1;
    }
}

class Rectangle extends Shape{
    //attributes
    private int width;
    private int height;

    //methods
    public Rectangle(String name , int width , int height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }
    public void printDetails()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Area : " + this.calcArea());
    }
    public int calcArea()
    {
        return width * height;
    }
}

class Main{
    public static void main(String[] args) {
        Shape s1 = new Shape("Shape 1");
        s1.printName();

        System.out.println();

        Rectangle r1 = new Rectangle("Rectagle 1", 10 , 15);
        r1.printName();
        System.out.println();
        r1.printDetails();

    }
}