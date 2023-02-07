package Day_2;
import java.lang.Math;

public class last_digit_of_the_given_number {
    public int last_digit(int input1) {
        input1=Math.abs(input1);
        return input1%10;
    }
}
