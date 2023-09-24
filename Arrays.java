public class Arrays{
    public static void main(String[] args){
       /* int[] numbers = new int[5]; // declaring
        numbers[0] = 1;
        numbers[1] = 11;
        numbers[2] = 143;
        numbers[3] = 13;
        numbers[4] = 14;*/

        int numbers1[] = {11, 12, 13, 4, 5, 9}; //
        for(int i:numbers1){
            System.out.println(i);
        }
        try {
            String names[] = {"rishitha", "nikki", "durgesh"};
            for (int j = 0; j < 6; j++) {
                System.out.println(names[j]);
            }
        }
        catch(java.lang.Exception e){
            System.out.println("Array lenngth is 3 but trying to access 4 th element");
        }


        int arr[][]
                = {{2, 7, 9}, {3, 6, 1}};

        // printing 2D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}
