import java.util.Scanner;
class Example1 {
    void add() {
        System.out.println("add");
        
    }
    void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.add( 30,40); 
    }
} 
class Example3 {
    int getNumber() {
        return 10;

    }

    public static void main(String[] args) {
        Example3 obj = new Example3();
        int result = obj.getNumber();
        System.out.println(result);
    }
}

classs Example5 {
    Static void staticMethod() {
        System.out.println("I am static");

    }
    void instanceMethod() {
        System.out.println(" I am instance")
    }
    public static void main(String[] args) {
        staticMethod();
        Example5 obj = new Example();
        obj.instanceMethod();

    }
}