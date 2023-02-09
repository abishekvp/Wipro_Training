package Day_3;
class nth_prime{
    public int nth_prime_no(int input1) {
        int num, count, i;
        num=1;
        count=0;
        while (count < input1){
            num=num+1;
            for (i = 2; i <= num; i++){
                if (num % i == 0){return 0;}
            }
            if ( i == num){count = count+1;}
        }
        return num;
    }
}
