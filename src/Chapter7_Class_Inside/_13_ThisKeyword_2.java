package Chapter7_Class_Inside;

class AA {
    int m;
    int n;
    void init (int m, int n) {
        m = m;
        n = n;
    }
}
class BB {
    int m;
    int n;
    void init (int m, int n) {
        this.m = m;
        this.n = n;
    }
}

public class _13_ThisKeyword_2 {
    public static void main(String[] args) {
        // 필드명과 지역 변수명이 같고, this 키워드를 사용하지 않음!
        AA a = new AA();
        a.init(2, 3);
        System.out.println(a.m);
        System.out.println(a.n);

        // 필드명과 지역 변수명이 같고, this 키워드를 사용함!
        BB b = new BB();
        b.init(2, 3);
        System.out.println(b.m);
        System.out.println(b.n);
    }
}
