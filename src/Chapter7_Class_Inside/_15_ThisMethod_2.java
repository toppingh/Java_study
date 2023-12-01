package Chapter7_Class_Inside;

class Ab {
    int m1, m2, m3, m4;
    Ab() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    Ab(int ab) {
        m1 = ab;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    Ab(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print() {
        System.out.println(m1 + " ");
        System.out.println(m2 + " ");
        System.out.println(m3 + " ");
        System.out.println(m4 + " ");
        System.out.println();
    }
}

class Ba {
    int m1, m2, m3, m4;
    Ba() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    Ba(int ba) {
        this(); // B() 생성자 호출
        m1 = ba;
    }
    Ba(int a, int b) {
        this(a); // Ba(int ba) 생성자 호출
        m2 = b;
    }
//    Ba(int a, int b) {
//        this();
//        m1 = a;
//        m2 = b;
//    } // B() 생성자를 호출하고 두 필드 값을 한 번에 수정할 수 있음!

    void print() {
        System.out.println(m1 + " ");
        System.out.println(m2 + " ");
        System.out.println(m3 + " ");
        System.out.println(m4 + " ");
        System.out.println();
    }
}
public class _15_ThisMethod_2 {
    public static void main(String[] args) {
        // 3가지 객체 생성(this() 미사용)
        Ab a1 = new Ab();
        Ab a2 = new Ab(10);
        Ab a3 = new Ab(10, 20);
        a1.print();
        a2.print();
        a3.print();
        System.out.println();

        // 3가지 객체 생성 (this() 사용!)
        Ba b1 = new Ba();
        Ba b2 = new Ba(10);
        Ba b3 = new Ba(10, 20);
        b1.print();
        b2.print();
        b3.print();
    }

}
