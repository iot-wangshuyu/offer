/**
 * @package: linkread
 * @className: offer241
 * @description: 剑指offer2.4.1旋转数组最小数字
 * @author: Shuyu.Wang
 * @date: 2019-04-27 17:51
 * @since: 0.1
 **/

public class offer241 {

	public static Integer min(int[] array) {
		if (array == null || array.length < 1) {
			return null;
		}
		//第一个下标
		int first = 0;
		//最后一个下标
		int last = array.length - 1;
		//中间下标
		int minIndex = first;
		while (array[first] >= array[last]) {
			//第一个下标数字大于最后一个下标数，且两个下标相差1的时候，最后下标的数就是最小值
			if (last - first == 1) {
				minIndex = last;
				break;
			}
			minIndex = (first + last) / 2;
			//如果三个下标指向的数字相等，那么只能顺序查找
			if (array[first] == array[last] && array[first] == array[minIndex]) {
				return minOrder(array, first, last);
			}
			if (array[minIndex] >= array[first]) {
				first = minIndex;
			} else if (array[minIndex] <= array[last]) {
				last = minIndex;
			}

		}
		return array[minIndex];
	}

	public static Integer minOrder(int[] array, int first, int last) {
		int result = array[first];
		for (int i = first + 1; i <= last; i++) {
			if (result > array[i]) {
				result = array[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
//		int[] array = { 3, 4, 5, 1, 2 };

		int[] array = { 1, 0, 1, 1, 1 };
		System.out.println(min(array));

	}
}
