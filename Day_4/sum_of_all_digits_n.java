package Day_4;

public class sum_of_all_digits_n {
    public int digitsum(int input1) {
        int input = Math.abs(input1);
        int sum = 0;
        while(input>0 || sum>9){
            if(input==0){
                input=sum;
                sum=0;
            }
            sum+=input%10;
            input/=10;
        }
        if(input>0){return sum;}
        else{return -1*sum;}
    }
}