package my.exercises;

public class Practice2 {
    public static void main(String[] args) {
        int [] nums = {21,7,0,14,5,32};

        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if( nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
    }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);


    }

}
