package my.exercises;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
        int [] numbers = {1,2,3,4,5};
        int [] reverse = new int[numbers.length];
        int n = 0 ;
        for(int i = numbers.length - 1; i < numbers.length && i >= 0; i--){
            reverse[n] = numbers[i];
            n++;
        }

        System.out.println(Arrays.toString(reverse));

        String name = "mehmet";
        char first_letter = name.charAt(0);
        System.out.println(first_letter);

        String  backwards = "";

        for( int i = name.length()-1; i >= 0; i--){

         backwards = backwards + name.charAt(i);

        }
        System.out.println(backwards);
    }
}
