import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Java Program to solve FizzBuzz problem
 * 
 * @author WINDOWS 8
 *
 */
public class FizzBuzzTest {

    /**
     * Java Method to solve FizzBuzz problem, which states that program
     * should print fizz if number is multiple of 3, 
     * print buzz if number is multiple
     * of 5, and print fizzbuzz if number is multiple of both 3 and 5
     * 
     * @param number
     * @return
     */
   
    public static String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }
    
    

    @Test
    public void testFizzBuzzV(){
        assertEquals("fizz", fizzBuzzV(3));
        assertEquals("buzz", fizzBuzzV(5));
        assertEquals("fizzbuzz", fizzBuzzV(15));
        assertEquals("2", fizzBuzzV(2));
    }
}


