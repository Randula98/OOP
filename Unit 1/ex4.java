import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        String name;
        int age;
        double salary;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your Name : ");
        name = scan.nextLine();

        System.out.print("Enter Your Age : ");
        age = scan.nextInt();

        System.out.print("Enter Your Salary : ");
        salary = scan.nextDouble();

        System.out.println();

        //System.out.println("Name : " + name + "/ Age : " + age + "/ Salary : " + salary);
        System.out.print("Name : " + name);
        System.out.print("  Age : " + age);
        System.out.print("  Salary : " + salary);
    }
}
