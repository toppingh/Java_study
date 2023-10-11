package Reference_type;

import java.util.Arrays;

public class _04_ReadArraydata {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 5, 6, 7};

        // 배열 길이
        System.out.println(array.length);

        // 출력 첫번째 방법
        System.out.print(array[0]+ " ");
        System.out.print(array[1]+ " ");
        System.out.print(array[2]+ " ");
        System.out.print(array[3]+ " ");
        System.out.println();

        // 출력 두번째 방법
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        // 출력 세번째 방법
        for (int k: array) {
            System.out.println(k + " ");
        }
        System.out.println();

        // 출력 네번째 방법
        System.out.println(Arrays.toString(array));
    }
}
