package Chapter9_Modifier;

class AA {
    void abc() { // 인스턴스 메서드
        System.out.println("instance 메서드");
    }

    static void bcd() { // 정적 메서드
        System.out.println("static 메서드");
    }
}

public class _03_StaticMethod {
    public static void main(String[] args) {
        // 인스턴스 메서드 활용(객체 생성 후 사용 가능)
        AA a1 = new AA();
        a1.abc();

        // 정적 메서드 활용
        // 1. 클래스명으로 바로 접근 가능
        AA.bcd();

        // 2. 객체를 생성한 후 사용(권장 x)
        AA a2 = new AA();
        a2.bcd();
    }
}
