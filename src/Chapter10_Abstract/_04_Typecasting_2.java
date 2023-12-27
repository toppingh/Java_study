package Chapter10_Abstract;

class Aa {
    int m = 3;
    void abc() {
        System.out.println("A 클래스");
    }
}

class Bb extends Aa {
    int n = 4;
    void bcd() {
        System.out.println("B 클래스");
    }
}

public class _04_Typecasting_2 {
    public static void main(String[] args) {
        // Aa 타입 / Aa 생성자
        Aa aa = new Aa();
        System.out.println(aa.m);
        aa.abc();

        // Bb 타입 / Bb 생성자
        Bb bb = new Bb();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        // Aa  타입 / Bb 생성자: 다형적 표현
        Aa ab = new Bb();
        System.out.println(ab.m);
        ab.abc();
    }
}
