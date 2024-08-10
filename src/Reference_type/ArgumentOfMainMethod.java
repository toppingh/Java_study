package Reference_type;

public class ArgumentOfMainMethod {
    public static void main(String[] args) { // String[] args -> abc 13 123 a 전달
        // args 배열 길이
        System.out.println(args.length);
        System.out.println();

        // 입력매개변수 출력 1
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();

        // 입력매개변수 출력 2
        for (String s : args) {
            System.out.println(s);
        }
        System.out.println();
    }
}
