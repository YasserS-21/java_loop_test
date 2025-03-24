package org.example;

import java.util.Arrays;

public class ReverseString {
    //use do while loop for this exercise
    public static String reverseString(String str) {
        if (str.isEmpty()){
            return str;
        }
       char[] charArray = str.toCharArray();
       int left = 0;
       int right = charArray.length - 1;
        do {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        } while (left <= right);
        return new String(charArray);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
