package my.exercises;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int [] numbers = {1,2,3,4,5};
        for(int i = numbers.length - 1; i < numbers.length && i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
