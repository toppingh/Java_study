package Reference_type;

public class _01_array {
    public static void main(String[] args) {
        // 배열 선언 첫번째 방법
        int[] array1 = new int[3]; // 자료형 뒤에 대괄호
        int[] array2;
        array2 = new int[3];

        // 배열 선언 두번째 방법
        int array3[] = new int[3]; // 변수명 뒤에 대괄호
        int array4[];
        array4 = new int[3];

        // 기본 자료형 배열, 참조 자료형 배열열
        boolean[] array5 = new boolean[3];
        int[] array6 = new int[5];
        double[] array7 = new double[7];
        String[] array8 = new String[9];

        // 배열에 값 대입 첫번째 방법
        int[] array9 = new int[3]; // 배열의 원소 값 강제 초기화 (정수혀이므로 0으로 초기화)
        array9[0] = 3;
        array9[1] = 4;
        array9[2] = 5;
        System.out.println(array9[0] + " " + array9[1] + " " + array9[2]);

        int[] array10;
        array10 = new int[3]; // 배열의 선언과 객체 대입 분리
        array10[0] = 1;
        array10[1] = 2;
        array10[2] = 3;
        System.out.println(array10[0] + " " + array10[1] + " " + array10[2]);

        // 배열에 값 대입 두번째 방법
        int[] array11 = new int[]{5, 6, 7}; // 강제 초기화 생략, 바로 값 대입
        System.out.println(array11[0] + " " + array11[1] + " " + array11[2]);

        int[] array12;
        array12 = new int[]{5, 6, 7}; // 배열 선언과 객체 대입 분리 가능
        System.out.println(array12[0] + " " + array12[1] + " " + array12[2]);

        int[] array13 = {7, 8, 9}; // 강제 초기화 생략, 바로 값 대입
        System.out.println(array13[0] + " " + array13[1] + " " + array13[2]);
    }
}
