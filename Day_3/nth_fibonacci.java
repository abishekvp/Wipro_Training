package Day_3;

class nth_fibonacci {
	static int fib(int n){
		if (n==0||n==1)
			return 0;
	    else if(n==2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
    public int check_multiple(int input1){
		return fib(input1);
	}
}
