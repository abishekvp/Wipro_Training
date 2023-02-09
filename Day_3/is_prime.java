package Day_3;
class is_prime{
    public int is_prime_no(int input1) {
        int i,m=0,flag=0;
        m=input1/2;      
        if(input1==0||input1==1){return 0;}
        else{
            for(i=2;i<=m;i++){
                if(input1%i==0){
                    flag=1;
                    return 0;
                }
            }
            if(flag==0){return input1;}
            else{return 0;}
         }
    }
}
