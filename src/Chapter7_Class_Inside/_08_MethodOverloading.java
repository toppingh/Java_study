package Chapter7_Class_Inside;

public class _08_MethodOverloading {
    public static void main(String[] args) {
        print(); // 데이터가 없습니다.
        print(3); // 3
        print(3.14); // 3.14
        print(2, 5); // a: 2 b: 5
    }

    public static void print() {
        System.out.println("데이터가 없습니다.");
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(double a) {
        System.out.println(a);
    }

//    public static void print(double b) {
//        System.out.println(b);
//    } // void print(double a) 메서드와 중복 => 정의 불가능!!

    public static void print(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

//    public static void print(int a, int b) {
//        System.out.println("a: " + a + " b: " + b);
//        return a + b;
//    } // void print(int a, int b) 메서드와 중복 => 정의 불가능!!
}
