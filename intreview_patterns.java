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