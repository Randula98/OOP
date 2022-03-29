class Main{
    public static void main(String[] args) {
        // int a = 10;
        // int b = 3;

        // double c = (double) a / b;

        // System.out.println(c);


        // System.out.println();

        //array declaration
        int data[];

        //allocate memory
        data = new int[10];

        //declare and allocate memory at the same line
        int array[] = new int[5];

        for (int i = 0 ; i < 5 ; i++)
        {
            array[i] = i + 1;
        }

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println(array[i]);
        }

    }
}