package Reference_type;

import java.util.Arrays;

public class _02_array_ex {
    public static void main(String[] args) {
        // 스택 메모리값(강제 초기화x)
        int value1;
//        System.out.println(value1); -> 스택 메모리에 위치하는 변수는 초기화가 없으면 출력이 불가능하다!!
        int[] value2;
//        System.out.println(value2); -> 스택 메모리에 위치하는 변수는 초기화가 없으면 출력이 불가능하다!!

        int value3 = 0;
        System.out.println(value3);
        int[] value4 = null;
        System.out.println(value4);
        System.out.println();

        // 힙 메모리의 초깃값(강제 초기화)
        // 기본 자료형
        boolean[] array1 = new boolean[3]; // 기본으로 false로 강제 초기화
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
        System.out.println();

        int[] array2 = new int[3]; // 기본으로 0으로 강제 초기화
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
        System.out.println();

        double[] array3 = new double[3]; // 기본으로 0.0으로 강제 초기화
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i] + " ");
        }
        System.out.println();

        // 참조 자료형
        String[] array4 = new String[3]; // 기본으로 null로 강제 초기화
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i] + " ");
        }
        System.out.println();

        // 배열 한번에 출력
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
