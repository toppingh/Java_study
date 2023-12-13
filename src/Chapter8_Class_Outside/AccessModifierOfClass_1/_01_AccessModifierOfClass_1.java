package Chapter8_Class_Outside.AccessModifierOfClass_1;

public class _01_AccessModifierOfClass_1 {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A();
        B b = new B();
        C c = new C();
        // 같은 패키지 내에서는 public과 default 클래스의 타입 모두 객체를 선언할 수 있음!
        // public 생성자와 default 생성자 모두 호출 가능하다!
    }
}
