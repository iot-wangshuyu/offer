/**
 * @package: PACKAGE_NAME
 * @className: ChangeArraySort
 * @description: 改变数据顺序，剑指offer面试题14
 * @author: Shuyu.Wang
 * @date: 2019-05-26 16:47
 * @since: 0.1
 **/

public class ChangeArraySort {

	public static int[] reorderOddEven(int[] array) {
		//判断数组是否为空
		if (array == null || array.length == 0) {
			return null;
		}
		//头指针
		int pBegin = 0;
		//尾指针
		int pEnd = array.length-1;
		while (pBegin < pEnd) {
			//将头指针后移，直到为偶数
			while (pBegin < pEnd && (array[pBegin] % 2 != 0)) {
				pBegin++;
			}
			//将尾指针前移，直到为奇数
			while (pBegin < pEnd && (array[pEnd] % 2 == 0)) {
				pEnd--;
			}
			if (pBegin < pEnd) {
				int temp = array[pBegin];
				array[pBegin] = array[pEnd];
				array[pEnd] = temp;
			}
		}
		return array;

	}

	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num+"  ");
		}
	}

	public static void main(String[] args) {
		int[] array={1,4,2,5,3,6};
		printArray(reorderOddEven(array));
	}
}
