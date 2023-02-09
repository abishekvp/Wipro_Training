package Day_4;

public class all_digit_count {
    public int no_of_digits(int input1, int input2) {
        int c=0;
        while(input1>0){input1/=10;c++;}
        return c;
    }
}
