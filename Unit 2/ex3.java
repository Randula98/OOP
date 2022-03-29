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
    protected int width;
    protected int height;

    //methods
    public Rectangle(String name , int width , int height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    public void displayParameters()
    {
    	System.out.println("Width : " + width + " Height : " + height); 	
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

class Box extends Rectangle{
	//attribute
	private int length;

	public Box(String name, int width, int height , int length) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
		this.length = length;
	}
	
	public void printDetails()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Length : " + this.length);
        System.out.println("Area : " + this.calcArea());
    }
	
	public int calcArea()
    {
        return 2 * ((length * height) + (length * width) + (height * width));
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
        
        System.out.println();
        
        Box b1 = new Box("Box 1" , 10 , 15 , 20);
        b1.printName();
        System.out.println();
        b1.printDetails();
    }
}