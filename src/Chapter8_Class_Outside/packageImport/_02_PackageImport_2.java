package Chapter8_Class_Outside.packageImport;

import Chapter8_Class_Outside.common.A;

public class _02_PackageImport_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A(); // 클래스 A를 임포트했으므로 A a = new A()로 객체 생성 가능

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
