/**
 * @package: PACKAGE_NAME
 * @className: Power
 * @description:剑指offer 3.3 数值的整数次方
 * @author: Shuyu.Wang
 * @date: 2019-05-12 17:38
 * @since: 0.1
 **/

public class Power {

	public static Double powerWithUnsignedExponent(double base,int exponent){
		if (exponent==0){
			return 1.0;
		}
		if (exponent==1){
			return base;
		}
		Double result = powerWithUnsignedExponent(base, exponent >> 1);
		result *=result;
		if ((exponent&0x1)==1){
			result*=base;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(powerWithUnsignedExponent(2,3));
	}
}
