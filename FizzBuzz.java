package nadiatests;

import java.math.BigDecimal;

/**
 * if a number is a multiple of 3, print Fizz
 * if a number is a multiple of 5, print Buzz
 * if a number is a multiple of both, print FizzBuzz
 */
public class FizzBuzz {

    public static void main(String[] argc) {
        for (int i = 0; i<50 ; i++) {
            if (i%15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }  else {
                System.out.println(i);
            }
        }
    }

}
