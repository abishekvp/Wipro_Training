package Day_2;
public class how_many_are_odd {
    public int count_odd(int input1,int input2,int input3,int input4,int input5) {
        int c=0;
        if(input1%2!=0){c+=1;}
        if(input2%2!=0){c+=1;}
        if(input3%2!=0){c+=1;}
        if(input4%2!=0){c+=1;}
        if(input5%2!=0){c+=1;}
        return c;
    }
}
