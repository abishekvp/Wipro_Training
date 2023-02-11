package Day_6;

public class sum_of_power_of_digits {
    public int power_of_digits(int input1, int input2){
        double sum=0.0;
        String str=Integer.toString(input1);   
        for(int i=0;i<str.length()-1;i++){
            int a=Character.getNumericValue(str.charAt(i)); 
            int b=Character.getNumericValue(str.charAt(i+1));   
            sum=sum + Math.pow(a, b);
        }
        return (int)sum+1;
    }
}
