package java_ex;

public class _03_do_while {
    public static void main(String[] args) {
        int a;
        a = 0;
        while(a < 0) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while(a < 0);
        System.out.println();

        a = 0;
        while(a < 1) {
            System.out.print(a + " ");
            a++;
        } while(a < 1);
        System.out.println();

        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while(a < 1);
        System.out.println();

        a = 0;
        while(a < 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while(a < 10);
    }
}
