package Chapter7_Class_Inside;

class AB {
    AB() {
        System.out.println("첫 번째 생성자");
    }
    AB(int ab) {
        System.out.println("두 번째 생성자");
    }
    AB(int a, int b) {
        System.out.println("세 번째 생성자");
    }
}

public class _11_ConstructorOverloading {
    public static void main(String[] args) {
        AB ab1 = new AB();
        AB ab2 = new AB(5);
        AB ab3 = new AB(1, 2);
    }
}
