/**
 * @package:PACKAGE_NAME
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-04-02 16:39
 * @version:V1.0
 **/

public class ArraryFind {

    public static Boolean find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int n = 0;
        int m = array[0].length - 1;
        int temp = array[0][m];
        while (target != temp) {
            if (m > 0 && n < array.length - 1) {
                if (target > temp) {
                    n = n + 1;
                } else if (target < temp) {
                    m = m - 1;
                }
                temp = array[n][m];
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int array[][] = {{1, 3, 5}, {2, 4, 6}, {3, 5, 7}};
        int target = 9;
        System.out.println(find(target, array));
    }

}
