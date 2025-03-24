package org.example;


public class ConvertUnitVowel {
    //use do while loop for this exercise
    public static String convertUntilVowel(String str) {

        if (str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder("");
        String vowels = new String("aeiou");
        int index = 0;
        do {
            String originalChar = "" + str.charAt(index);
            if (vowels.contains(originalChar)){
                originalChar = originalChar.toUpperCase();
            }
            sb.append(originalChar);
            index++;
        } while (index < str.length());
        return sb.toString();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
