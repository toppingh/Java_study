package Reference_type;

import java.util.Arrays;

public class _14_MethodsOfString_2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY

        // @replace()
        System.out.println(str1.replace("Study", "공부")); // Study를 공부로 변경

        // @substring()
        System.out.println(str1.substring(0, 5)); // 0 <= 인덱스 <= 5의 문자열

        // @split()
        String[] strArray = "abc/def-ghi jkl".split("/|-| "); // / 또는 - 또는 공백으로 구분된 문자열 배열 반환
        System.out.println(Arrays.toString(strArray));

        // @trim()
        System.out.println("    abc    ".trim()); // abc
        System.out.println();

        // 문자열 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        // new로 생성해 메모리에 별도의 객체로 생성

        // @stacak 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        // @equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str3));
    }
}
