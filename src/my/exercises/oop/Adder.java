package my.exercises.oop;

public class Adder {

//  Method Overloading  - Changing the number of arguments

//    static int add(int a, int b) { return a + b;};
//    static int add(int a, int b, int c) { return a + b + c;};

    // Method Overloading - Changing data type of arguments
    static int add(int a, int b){return a+b;}  // 2 arguments of int data type
    static double add(double a, double b){return a+b;}  // 2 arguments of double data type

}

class TestOverloading1{
    public static void main(String[] args) {
//        System.out.println(Adder.add(11,11));
//        System.out.println(Adder.add(11,11,11));

        // Method Overloading - Changing data type of arguments
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(12.3,12.6));
    }

}