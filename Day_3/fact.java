package Day_3;

public class fact {
    public int is_prime_no(int input1) {
        int i,fact=1;      
        for(i=1;i<=input1;i++){fact=fact*i;}
        return fact;
    }
}
