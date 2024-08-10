package Reference_type;

import java.util.Arrays;

public class _04_ReadArraydata {
    public static void main(String[] args) {
        // 2차원 데이터의 배열의 길이
        int[][] arr1 = new int[2][3];
        System.out.println(arr1.length); // 행 개수, 2
        System.out.println(arr1[0].length); // 첫번째 행의 열 개수, 3
        System.out.println(arr1[1].length); // 두번째 행의 열 개수, 3
        System.out.println();

        int[][] arr2 = new int [][] {{1, 2}, {3, 4, 5}};
        System.out.println(arr2.length); // 2
        System.out.println(arr2[0].length); // 2
        System.out.println(arr2[1].length); // 3
        System.out.println();

        // 2차원 배열 출력
        System.out.print(arr2[0][0] + " "); // 1
        System.out.print(arr2[0][1] + " "); // 2
        System.out.println();
        System.out.print(arr2[1][0] + " "); // 3
        System.out.print(arr2[1][1] + " "); // 4
        System.out.print(arr2[1][2]); // 5
        System.out.println();

        // 이중 for문
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 이중 for-each문
        for (int[] arr: arr2) {
            for (int k:arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
