package Chapter7_Class_Inside;

import java.util.Arrays;

// Q1. 클래스 A1이 정의됐을 때 코드의 출력값
class A1 {
    boolean a;
    int b;
    double c;
    String d;

    void abc() {
        System.out.println(b + c);
        System.out.println(c + d);
        System.out.println(d + a);
    }
}

// Q2. 4가지 형태로 오버로딩된 print() 메서드의 실행 결과를 보고 클래스를 완성하시오.
class A2 {
    void print() {
        System.out.println("입력 값이 없습니다.");
    }

    void print(int a) {
        System.out.println("정수 입력값 : " + a);
    }

    void print(double a) {
        System.out.println("실수 입력값 : " + a);
    }

    void print(String a) {
        System.out.println("문자열 입력값 : " + a);
    }
}

// Q3. 클래스 A3 내부에 int[] 객체를 입력매개변수로 입력받아 배열의 모든 원소를 합한 후 리턴하는 arraySum()메서드가 정의됐을 때 오류발생 코드와 이유
class A3 {
    int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

// Q4. 기본 자료형과 참조 자료형을 입력매개변수로 하는 abc(), bcd() 메서드가 정의돼있을 때 코드의 출력값
class A4 {
    void abc(int m) {
        m = 8;
    }

    void bcd(int[] n) {
        n[0] = 4; n[1] = 5; n[2] = 6;
    }
}

// Q5. 가변 길이 자료형으로 여러 개의 정수를 개수와 상관없이 입력받아 평균 값 출력 메서드 정의
class A5 {
    void averageScore(int... scores) {
        int sum = 0;
        for (int i: scores) {
            sum += i;
        }
        double avg = (double) sum / scores.length;
        System.out.println(avg);
    }
}

// Q6. 생성자 2개가 정의돼 있을때 객체 생성 (입력값 자유)
class A6 {
    A6 (int k){}
    A6 (double a, double b) {}
}

public class Question {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
        System.out.println();

        a.abc();
        System.out.println();

        A2 b = new A2();
        b.print();
        b.print(3);
        b.print(5.8);
        b.print("안녕");
        System.out.println();

        A3 c = new A3();
        int[] data1 = new int[] {1, 2, 3};
        int[] data2 = {1, 2, 3};

        System.out.println(c.arraySum(data1));
        System.out.println(c.arraySum(data2));
        System.out.println(c.arraySum(new int[] {1, 2, 3}));
//        System.out.println(c.arraySum({1, 2, 3})); // 메서드에 매개변수를 넘기면 선언(int[] array)과 값의 대입(array = {1, 2, 3})이 분리되어 실행된다.
        // int[] a = {1, 2, 3}의 객체 생성 방법은 선언과 동시에만 사용할 수 있으므로 분리가 불가능해 오류가 발생한다!

        A4 d = new A4();
        int m = 5;
        int[] n= {1, 2, 3};

        d.abc(m);
        d.bcd(n);

        System.out.println(m);
        System.out.println(Arrays.toString(n));

        A5 e = new A5();
        e.averageScore(1);
        e.averageScore(1, 2);
        e.averageScore(1, 2, 3);
        e.averageScore(1, 2, 3, 4);

        A6 f = new A6(1);
        A6 f1 = new A6(1.0, 2.0);
    }
}
