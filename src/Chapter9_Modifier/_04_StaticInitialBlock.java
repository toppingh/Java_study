package Chapter9_Modifier;

class C {
    int a;
    static int b;
    static {
        b = 5; // 정적 필드의 초기화는 static {} 내에서 수행
        System.out.println("클래스 C가 로딩됐습니다요!!");
    }
    C() {
        a = 3; // 인스턴스 필드 초기화는 일반적으로 생성자에서 수행
    }
}

public class _04_StaticInitialBlock {
    public static void main(String[] args) {
        System.out.println(C.b);
        // C.b가 실행되는 시점에 클래스 C가 메모리에 로딩되며, 이때 static {} 초기화 블록을 실행한다.
    }
}
