package Chapter8_Class_Outside.packageImport;

public class _01_PackageImport_1 {
    public static void main(String[] args) {
        // 객체 생성
        // A a = new A(); // 오류
        Chapter8_Class_Outside.common.A a = new Chapter8_Class_Outside.common.A();
        // 다른 패키지의 클래스를 사용할 때는 패키지명을 포함한 풀네임을 사용해야 함

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
