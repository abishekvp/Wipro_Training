package Day_5;

public class is_palindrome_str {
    public int is_palindrome(String input1) {
        String str=input1.toLowerCase();
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str.equals(str1)){return 2;}
        else{return 1;}
    }
}
