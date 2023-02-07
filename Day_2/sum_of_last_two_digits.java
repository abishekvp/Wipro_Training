package Day_2;

public class sum_of_last_two_digits {
    public int sum_of_digits(int input1, int input2) {
        input1=Math.abs(input1);
        input2=Math.abs(input2);
        return (input1/10)%10 + (input2/10)%10;
    }
}
