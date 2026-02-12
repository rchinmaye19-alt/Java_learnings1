class demo{
    public static void main(String[] args) {

        if(5<6)

        {
            System.out.println("5 is grater than 6");

        }
        else
        {
            System.out.println("6 is grater than 5");

        }
    }
}
class JaggedArrayExample {
    public static void main(String[] args) {
        int n = 5;
        // Create a jagged array
        int[][] staircase = new int[3][];

        for (int i =0; i < n; i++) {
            staircase[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                staircase[i][j] = j + 1;
            }
        }

        System.out.println("Staircase Pattern:");
        for (int i = 0; i < staircase.length; i++) {
            for (int j = 0; j < staircase[i].length; j++) {
                System.out.print(staircase[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }


}
   j
class ArrayMax{
    public static void main(String[] args) {
        int[] arr = {10,30,60,80 };
        int max = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max:"+max);
    }
}
 class ArrayMax{
    public static void main(String[] args) {
        int[] arr = {10,30,60,80};
        int max=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
        }
            System.out.println("max:"+max);

    }
}