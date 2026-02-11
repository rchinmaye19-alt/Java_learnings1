import java.util.Scanner;
class Array1DExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[2]);
        System.out.println("Third element: " + numbers[4]);
        }
    }


    class Array1DPrint {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};

            System.out.println("Elements of the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

class Array1DEnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Elements of the array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}