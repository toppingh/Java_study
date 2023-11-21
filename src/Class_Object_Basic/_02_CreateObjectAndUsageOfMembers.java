package Class_Object_Basic;

// 클래스 = 붕어빵 가게 정의
class Machine {
    int cnt = 3;

    void print() {
        System.out.println("붕어빵 객체 생성 및 활용");
    }
}

public class _02_CreateObjectAndUsageOfMembers {
    public static void main(String[] args) {
        // 붕어빵 생성! (객체 생성)
        Machine bread = new Machine();

        /// 클래스 멤버 활용 (붕어빵 먹기)
        // @필드 활용: 필드에 값 읽기/쓰기
        bread.cnt = 5;
        System.out.println(bread.cnt);

        // @메서드 활용: 메서드 호출
        bread.print();
    }
}
