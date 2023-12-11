package Chapter8_Class_Outside.pack1; // A.java와 같은 패키지

public class B {
    public void print() {
        // 객체 생성
        A a = new A(); // 다른 클래스의 인스턴스 멤버를 사용하기위해 객체 생성

        // 멤버 활용
        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
        // => 클래스 A는 같은 패키지에 있으므로 public, protected, default 접근 지정자로 지정된 필드는 사용 가능
//        System.out.print(a.d + " "); // private 접근 지정자로 지정된 필드는 접근 불가능
        System.out.println();
    }
}
