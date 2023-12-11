package Chapter8_Class_Outside.pack2; // A.java와 다른 pack2 패키지 사용!

import Chapter8_Class_Outside.pack1.A; // pack1의 클래스 A 임포트!

public class D extends A {
    public void print() {
        // 멤버 활용
        System.out.print(a + " ");
        System.out.print(b + " ");
//        System.out.print(c + " ");
//        System.out.print(d);
        // => 자식 클래스는 다른 패키지에 있어도 객체의 생성없이 protected 접근 지정자 필드까지 접근 가능!
        System.out.println();
    }
}
