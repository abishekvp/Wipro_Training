package Day_5;

public class wieght_of_hill_pattern {
    public int wieght_of_pattern(int input1,int input2,int input3) {
        int sum=0;
        for(int i=0;i<input1;i++){
            for(int j=0;j<=i;j++){
                sum+=input2;
            }
            input2+=input3;
        }
        return sum;
    }
}
