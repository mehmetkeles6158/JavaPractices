package my.exercises;

public class Fibonacci {

   public static void fibonacci (){
        int n1 = 0;
        int n2 = 1 ;

        for( int i = 2; i < 10 ; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }

}
