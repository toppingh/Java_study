package Chapter7_Class_Inside;

// 클래스 정의!
class C {
    // 리턴 타입 void, 입력매개 변수가 없을 때 => 리턴되는 값x
    void print() {
        System.out.println("안녕");
    }

    // 리턴 타입 int,  입력 매개 변수가 없을 때 => 리턴되는 값의 자료형 = int
    int data() {
        return 3;
    }

    // 리턴 타입 double, 입력 매개 변수가 2개일 때
    double sum(int a, double b) {
        return a + b;
    }

    // 리턴 타입 void, 내부에 리턴 포함(=> 함수 종료)
    void printMonth(int m) {
        if (m < 0 || m > 12) {
            System.out.println("잘못된 입력");
            return; // 함수 종료
        }
        System.out.println(m + "월입니다.");
    }
}

public class _03_ExternalCallMethods {
    public static void main(String[] args) {
        // 객체 생성
        C c = new C();

        // 메서드 호출(멤버 사용)
        c.print();

        int k = c.data();
        c.data();
        System.out.println(k);

        double result = c.sum(3, 5.2);
        System.out.println(result);

        c.printMonth(5);
        c.printMonth(15);
    }
}
