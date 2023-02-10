package Day_5;

public class create_pin {
    public int count_even(int input1,int input2,int input3) {
        int arr[]={input1,input2,input3},max=0,min,num;
        double sum=0.0,place=1.0;

        for(int i=0;i<3;i++){
            num=arr[i];
            while(num!=0){
            int r=num%10;
                if(r>max)
                    max=r;
                num=num/10;
            }
        }
        for(int i=0;i<3;i++){
            min=99;
            for(int j=0;j<3;j++){
                int rem=arr[j]%10;
                if(rem<min){min=rem;}
                arr[j]/=10;
            }
            sum=(min+(sum/place));
            sum*=place;
            place*=10;
        }
        return (int)(max*1000+sum);
    }
}