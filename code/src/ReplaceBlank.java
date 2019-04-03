/**
 * @package:PACKAGE_NAME
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-04-02 18:25
 * @version:V1.0
 **/

public class ReplaceBlank {


    public static String replaceBlank(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        //字符串原始长度
        int orgLength = stringBuffer.length();
        //空格数
        int numBlank = 0;
        //新字符串长度
        int newLength = 0;

        for (int i = 0; i < orgLength; i++) {
            if (stringBuffer.charAt(i) == ' ') {
                numBlank++;
            }
        }
        newLength = orgLength + numBlank * 2;
        char[] newChars = new char[newLength];
        newLength = newLength-1;
        for (int i = orgLength - 1; i >= 0; i--) {
            if (stringBuffer.charAt(i) == ' ') {
                newChars[newLength--]='%';
                newChars[newLength--]='2';
                newChars[newLength--]='0';
            } else {
                newChars[newLength--]=stringBuffer.charAt(i);
            }
        }
        return new String(newChars);
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        System.out.println(replaceBlank(stringBuffer));
    }
}
