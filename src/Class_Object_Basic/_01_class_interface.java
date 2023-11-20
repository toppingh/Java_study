package Class_Object_Basic;

public class _01_class_interface {
    public static void main(String[] args) {
        // 클래스 - 일반 클래스, 추상 클래스(abstract class)
        class A {
            int m;
            int n;

            void abc() {
                System.out.println("일반 클래스 메서드 실행");
            }

            void bcd() {
                System.out.println("일반 클래스 두번째 메서드 실행");
            }
        }

//        abstract class A {
//            int m;
//            int n;
//
//            abstract void abc();
//            abstract void bcd();
//        }

//        interface A {
//            public static final int m = 1;
//            public static final int n = 2;
//
//            public abstract void abc();
//            public abstract void bcd();
//        }
    }
}
