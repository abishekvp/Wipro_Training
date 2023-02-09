package Day_4;

public class count_unique_int {
    public int count_unique_digits(int input1) {
	    int res = 0;
		int cnt[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		while (input1 > 0) {
			int rem = input1 % 10;
			cnt[rem]++;
			input1 = input1 / 10;
		}
		for (int i = 0;
			i < cnt.length; i++) {
			if (cnt[i] == 1) {
				res++;
			}
		}
        return res;
	}
}
