package Chapter8_Class_Outside;

class A { // 외부 클래스 A는 public 선언이 불가능하다!
    int m = 3;
    int n = 4;

    void print() {
        System.out.println(m + ", " + n);
    }
}

public class _03_ExternalClass_1 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        // public 여부와 관계없이 같은 패키지 내에서는 객체의 생성 및 활용이 가능하다!
    }
}
