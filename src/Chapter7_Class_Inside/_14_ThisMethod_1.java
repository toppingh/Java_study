package Chapter7_Class_Inside;

// 클래스 정의
class Aa {
    Aa() {
        System.out.println("첫 번째 생성자");
    }
    Aa(int a) {
        this(); // 반드시 생성자의 첫 줄에 위치해야 함!!!
        System.out.println("두 번째 생성자");
    }
//    void abc() {
//        this();
//    } // 메서드에서는 this() 메서드 사용 불가능!
}
public class _14_ThisMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        Aa a1 = new Aa(); // 첫 번째 생성자 호출
        System.out.println();
        Aa a2 = new Aa(3); // 두 번째 생성자 호출(생성자의 내부에서 첫 번째 생성자 호출)
    }
}
