package org.example;

public class FilterNumbers {
     //use do for loop for this exercise
    public static String filterNumbers(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i)))
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
