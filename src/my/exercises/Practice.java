package my.exercises;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        String [] words = {"angle","angel", "apple"};
        String word = "";
        for(int i =0; i < words.length; i++) {
            for(int j = 0; j < words[1].length(); j++) {
                if(words[i].charAt(j) == words[i+1].charAt(j)) {
                    word = words[i];
                }
            }
        }
        System.out.println(word);
        }

    }



