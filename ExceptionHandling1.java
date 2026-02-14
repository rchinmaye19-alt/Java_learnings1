class Exception1 {
    public static void main(String[] args) {
            int a = 10;
            int b = 0;
            try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero:" + e.getMessage());
        } 
            System.out.println("Program continues after handling the exception.");
    }
}

class Exception2{
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Cannot call method on a null object:");
        }
        System.out.println("Program continues after handling the exception.");
    }
}

class Exception3{
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds:" + e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }
}
