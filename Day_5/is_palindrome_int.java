package Day_5;

public class is_palindrome_int {
    public int is_palindrome(int input1) {
        int rev=0;
        int temp=input1;
        while(input1>0){
            rev=(rev*10)+input1%10;
            input1/=10;
        }
        if(temp==rev){return 2;} 
        else{return 1;}
    }
}
