/**
 * @package: PACKAGE_NAME
 * @className: offer243 位运算
 * @description: 剑指offer2.4.3 位于
 * @author: Shuyu.Wang
 * @date: 2019-05-04 16:59
 * @since: 0.1
 **/

public class offer243 {

	public static int numberOf1(int n){
		int count=0;
		while (n!=0){
			count++;
			n=(n-1)&n;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numberOf1(9));

	}
}
