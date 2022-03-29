import java.util.Scanner;

class ex5 {
    public static void main(String[] args) {
        int i;
        int input;

        int odd = 0 , even = 0;

        Scanner scan = new Scanner(System.in);

        for(i = 0 ; i < 10 ; i++)
        {
            System.out.print("Input a number : ");
            input = scan.nextInt();

            if (input % 2 == 0)
            {
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println();
        System.out.println(odd + " Odd numbers");
        System.out.println(even + " Even numbers");
    }
}
