package Day_4;

public class prime_in_a_range {
    public int prime_btwn_range(int input1, int input2) {
        int i, j, flag, c=0;
        for (i = input1; i <= input2; i++) {
            if (i == 1 || i == 0){
                continue;
            }
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){c+=1;}
        }
        return c;
    }
}