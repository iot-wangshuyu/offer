/**
 * @package: PACKAGE_NAME
 * @className: Fibonacci
 * @description: 剑指offer2.4.2 递归和循环
 * @author: Shuyu.Wang
 * @date: 2019-05-04 15:04
 * @since: 0.1
 **/

public class Fibonacci {

	public static long fib(int n){
		int[] result={0,1};

		if (n<2){
			return result[n];
		}

		long fibOne=1;
		long fibTwo=2;
		long fibN=n;

		for (int i=2;i<=n;i++){
			fibN=fibOne+fibTwo;
			fibTwo=fibOne;
			fibOne=fibN;
		}
		return fibN;
	}

	public static void main(String[] args) {
		System.out.println(fib(9));
	}
}
