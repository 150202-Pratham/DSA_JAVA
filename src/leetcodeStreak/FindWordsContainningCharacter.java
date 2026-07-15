package leetcodeStreak;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainningCharacter {
    public static void main(String []args){

        List<Integer> myList  = new ArrayList<Integer>();

        String []word = {"Leet" ,"Code"};
        char x = 'e';

        for(int i = 0 ; i<word.length ; i++){

            if(word[i].contains(String.valueOf(x))){

                myList.add(i) ;

            }
        }


        System.out.println(myList);


    }
}
