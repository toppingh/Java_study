package Chapter8_Class_Outside;

import Chapter8_Class_Outside.pack1.A;
import Chapter8_Class_Outside.pack1.B;
import Chapter8_Class_Outside.pack2.C;
import Chapter8_Class_Outside.pack2.D;
// 서로 다른 패키지에 있는 A, B, C, D 클래스 임포트

public class _01_AccessModifierOfMember {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();

        // 클래스의 객체 생성 및 print() 메서드 호출
    }
}
