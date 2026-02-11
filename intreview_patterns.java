class Diamond {
    public static void main(String[] args) {
        int n = 4;
        for (int i = -n; i <= n; i++) {
            for (int j = 0; j < Math.abs(i); j++) System.out.print(" ");
            for (int k = 0; k < 2*(n-Math.abs(i))+1; k++) System.out.print("*");
            System.out.println();
        }
    }
}

class Diamond1{
    public static void main(String[] args) {
        int n = 4;
        for (int i = -n; i <= n; i++) {
            for (int j = 0; j < Math.abs(i); j++) System.out.print(" ");
            for (int k = 0; k < 2*(n-Math.abs(i))+1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the butterfly

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n - 1; i >= 1; i--) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
