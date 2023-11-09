package Reference_type;

public class _07_NonRectangleArray {
    public static void main(String[] args) {
        // 비정방 행렬의 선언 및 대입 방법
        // 방법 1 : 배열 객체의 행 성분부터 생성하고 열 성분 생성하기
        int[][] array1 = new int[2][];
        array1[0] = new int[2];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[1] = new int[3];
        array1[1][0] = 3;
        array1[1][1] = 4;
        array1[1][2] = 5;

        System.out.println(array1[0][0] + " " + array1[0][1] + " ");
        System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2] + " ");
        System.out.println();

        int[][] array2 = new int[2][];
        array2[0] = new int[] {1, 2};
        array2[1] = new int[] {3, 4, 5};

        System.out.println(array2[0][0] + " " + array2[0][1] + " ");
        System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2] + " ");
        System.out.println();

        // 방법 2 : 자료형과 대입할 값만 입력하기
        int[][] array3 = new int[][] {{1, 2}, {3, 4, 5}};
        System.out.println(array3[0][0] + " " + array3[0][1] + " ");
        System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
        System.out.println();

        int[][] array4;
        array4 = new int[][] {{1, 2}, {3, 4, 5}};
        System.out.println(array4[0][0] + " " + array4[0][1] + " ");
        System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
        System.out.println();

        // 방법 3 : 대입값만 입력하기 -> 선언과 대입 분리 불가능
        int[][] array5 = {{1, 2}, {3, 4, 5}};
        System.out.println(array5[0][0] + " " + array5[0][1] + " ");
        System.out.println(array5[1][0] + " " + array5[1][1] + " " + array5[1][2] + " ");
        System.out.println();

//        int[][] array6;
//        array6 = {{1, 2}, {3, 4, 5}};
    }
}
