package Reference_type;

public class _11_SharingStringObject {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = "안녕";
        String str3 = "안녕"; // str2가 가리키는 객체 공유
        String str4 = new String("안녕"); // 새 객체 생성

        // 스택 메모리값 비교(==)
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str1);
    }
}