package Day_5;

public class word_weight {
    public int wieght_of_string(String input1, int input2){
        String str=input1.toUpperCase();
        int sum=0;
        for(int i=0;i<input1.length();i++){
            if(input2==0){
                if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || !Character.isLetter(str.charAt(i))){
                    continue;
                }
                else{
                    int a=str.charAt(i)-64;
                    sum+=a;
                }
            }
            else{
                if(!Character.isLetter(str.charAt(i))){continue;}
                else{
                    int a=str.charAt(i)-64;
                    sum+=a;
                }
            }
        }
        return sum;
    }
}
