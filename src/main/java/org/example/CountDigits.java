package org.example;

public class CountDigits {



    //use do while loop for this exercise
    public static int countDigits(int num) {
        int digitsInNum = 0;
        do {
            num = (num / 10);
            digitsInNum++;
        } while (num > 0);
        return digitsInNum;
    }

}
