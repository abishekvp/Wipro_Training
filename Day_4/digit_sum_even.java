package Day_4;

public class digit_sum_even {
    public int digitsumeven(int input1) {
        int digit;
        int sum=0;
        while(input1!=0){
            digit=input1%10;
            if(digit%2==0){
                sum=sum+digit;
            }
            input1=input1/10;
        }
        return sum;
    }
}
