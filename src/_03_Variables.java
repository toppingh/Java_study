public class _03_Variables {
    public static void main(String[] args) {
        String name = "황고명";
//        name = "황고명";
        int hour = 16;

        System.out.println(name + "님! 배송이 시작됩니다." + hour + "시에 방문 예정이에요!");
        System.out.println(name + "님! 배송이 " + hour + "시에 완료되었습니다.");

        double score = 90.2;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score);
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.141592647;
        float f = 3.141592647F;
        System.out.println(d);
        System.out.println(f);

//        int i = 100000000000000; -21억부터 +21억 사이의 범위만 가능, int의 범위를 벗어남
//        long i = 1000000000000L; // 그냥 숫자를 적으면 정수형으로 인식하므로 뒤에 l또는 L 추가
        long i = 1_000_000_000_000L;
        System.out.println(i);
    }
}
