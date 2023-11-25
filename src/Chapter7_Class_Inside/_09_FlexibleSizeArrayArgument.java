package Chapter7_Class_Inside;

import java.util.Arrays;

public class _09_FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        method1(1, 2); // 배열의 길이: 2     1, 2
        method1(1, 2, 3); // 배열의 길이: 3    1, 2, 3
        method1(); // 배열으이 길이: 0

        method2("안녕", "방가"); // 배열의 길이: 2    안녕<br> 방가
        method2("떙큐", "감사", "아리가또"); // 배열의 길이: 3    땡큐<br>감사<br>아리가또
        method2(); // 배열의 길이: 0
    }

    public static void method1(int... values) {
        System.out.println("배열의 길이: " + values.length);

        // 배열 출력 방법1 : for문
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i] + " ");
//        }

        // 배열 출력 방법2 : for-each문
//        for (int k:values) {
//            System.out.println(k + " ");
//        }

        // 배열 출력 방법3 : toString
        System.out.println(Arrays.toString(values));
        System.out.println();
    }

    public static void method2(String... values) {
        System.out.println("배열의 길이: " + values.length);
        // 배열 출력 방법1 : for문
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i] + " ");
//        }
        // 배열 출력 방법2 : for-each문
        for (String k: values) {
            System.out.println(k + " ");
        }
        // 배열 출력 방법3 : toString
//        System.out.println(Arrays.toString(values));
//        System.out.println();
    }
}
