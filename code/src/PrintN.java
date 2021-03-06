/**
 * @package: PACKAGE_NAME
 * @className: PrintN
 * @description: 打印从0到最大n位数
 * @author: Shuyu.Wang
 * @date: 2019-05-12 18:38
 * @since: 0.1
 **/

public class PrintN {

	//打印1到最大的n位数的主方法
	public static void printToMaxOfDigits(int n) {
		if (n <= 0) {
			System.out.println("输入的n没有意义");
			return;
		}
		char number[] = new char[n];
		for (int i = 0; i < number.length; i++) {
			number[i] = '0';
		}
		for (int i = 0; i < 10; ++i) {
			number[0] = (char) (i + '0');
			printToMaxOfNDigitsRecursively(number, n, 0);
		}
	}

	//利用递归实现1到最大的n位数的全排列
	public static void printToMaxOfNDigitsRecursively(char[] number, int n, int index) {
		if (index == n - 1) {
			printNumber(number);
			return;
		}
		for (int i = 0; i < 10; ++i) {
			number[index + 1] = (char) (i + '0');
			printToMaxOfNDigitsRecursively(number, n, index + 1);
		}
	}

	//输出
	private static void printNumber(char[] number) {
		boolean isBeginning0 = true;
		int nLength = number.length;
		for (int i = 0; i < nLength; ++i) {
			if (isBeginning0 && number[i] != '0') {
				isBeginning0 = false;
			}
			if (!isBeginning0) {
				System.out.print(number[i]);
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		printToMaxOfDigits(4);
	}
}
