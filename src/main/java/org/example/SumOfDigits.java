package org.example;

public class SumOfDigits {
    //use while loop for this exercise
    public static int sumOfDigits(int num) {
        int sum = 0;

       while (num > 0) {
           sum += num % 10;
           num = num / 10;
       }
       return sum;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
