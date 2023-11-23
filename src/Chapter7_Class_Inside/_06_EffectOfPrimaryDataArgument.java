package Chapter7_Class_Inside;

public class _06_EffectOfPrimaryDataArgument {
    public static void main(String[] args) {
        int a = 3; // main 함수의 지역 변수 a
        int result1 = twice(3);
        System.out.println(result1);

        int result2 = twice(a); // main 함수의 지역 변수 a
        System.out.println(result2);
        System.out.println(a); // main 함수의 지역 변수 a
    }

    public static int twice(int a) { // twice 메서드의 지역 변수 a
        a = a * 2; // twice 메서드의 지역 변수 a
        return a; // twice 메서드의 지역 변수 a
    }
}