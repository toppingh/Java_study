package Chapter7_Class_Inside;

class F {
    int m;
    void work() {
        System.out.println(m);
    }
//    F(){} // 생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가한다!
}

class G {
    int m;
    void work() {
        System.out.println(m);
    }
    G() {

    } // 기본 생성자를 직접 정의한 것!
}

class H {
    int m;
    void work() {
        System.out.println(m);
    }
    H(int a) { // 입력매개변수를 포함하고 있는 생성자 정의
        m = a; // 입력매개변수로 전달된 값으로 필드 초기화
    }
}

public class _10_DefaultConstructor {
    public static void main(String[] args) {
        // 클래스의 객체 생성
        F f = new F(); // 컴파일러가 자동으로 추가한 기본 생성자를 호출해 객체를 생성한다.
        G g = new G(); // 직접 정의한 기본 생성자를 호출해 객체를 생성한다.
        H h = new H(3); // 직접 정의한 생성자를 호출해 객체를 생성한다.


        // 메서드 호출
        f.work();
        g.work();
        h.work();
    }
}
