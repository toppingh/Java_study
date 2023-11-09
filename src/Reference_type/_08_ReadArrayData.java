package Reference_type;

public class _08_ReadArrayData {
    public static void main(String[] args) {
        // 2차원 데이터의 배열의 길이
        int[][] array1 = new int[2][3];
        System.out.println(array1.length); // 행의 개수
        System.out.println(array1[0].length); // 첫번째 행의 열 개수
        System.out.println(array1[1].length); // 두번째 행의 열 개수
        System.out.println();

        int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}};
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println(array2[1].length);
        System.out.println();

        // 2차원 배열의 출력 방법
        System.out.println(array2[0][0] + " ");
        System.out.println(array2[0][1] + " ");
        System.out.println();
        System.out.println(array2[1][0] + " ");
        System.out.println(array2[1][1] + " ");
        System.out.println(array2[1][2]);
        System.out.println();

        // 이중 for문
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 이중 for-each문
        for (int[] array: array2) {
            for (int k: array) {
                System.out.println(k + " ");
            }
            System.out.println();
        }
    }
}
