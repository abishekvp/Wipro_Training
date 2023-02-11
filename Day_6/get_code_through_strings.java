package Day_6;

public class get_code_through_strings {
    public int get_code(String input1) {
        String word[]=input1.split(" ");
        int sum=0;
        for(int i=0;i<word.length;i++){
            sum+=word[i].length();
            System.out.println(sum);
        }
        return (1 + (sum-1) %9);
    }
}
