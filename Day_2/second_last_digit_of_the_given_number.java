package Day_2;

public class second_last_digit_of_the_given_number {
    public int second_last_digit(int input1) {
        input1=Math.abs(input1);
        return (input1/10)%10;
    }
}
