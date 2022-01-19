package my.exercises.methods;

public class Squared {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
//        int result;
//
//        result = square(10);
//        System.out.println("Squared value of 10 is: " + result);

        for(int i = 0 ; i <= 5 ; i++) {
            int result = square(i); // call method

            System.out.println("Square of " + i + " is: " + result);
        }
    }
}
