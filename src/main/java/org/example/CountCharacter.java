package org.example;

public class CountCharacter {
     //use do for loop for this exercise
    public static int countCharacter(String str, char target) {
        int digitCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                digitCounter++;
            }
        }
        return digitCounter;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
