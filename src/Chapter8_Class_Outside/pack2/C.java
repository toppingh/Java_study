package Chapter8_Class_Outside.pack2; // A.java와 다른 패키지

import Chapter8_Class_Outside.pack1.A; // pack1의 클래스 A 임포트

public class C {
    public void print() {
        // 객체 생성
        A a = new A();

        // 멤버 활용
        System.out.print(a.a + " ");
//        System.out.print(a.b + " ");
//        System.out.print(a.c + " ");
//        System.out.print(a.d + " ");
        // => 다른 패키지 내의 클래스에서는 자식 클래스가 아닐 떄는 public 접근 지정자만 사용 가능!
        System.out.println();
    }
}
