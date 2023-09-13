package java_ex;

public class _06_test {
    public static void main(String[] args) {
        // Q1번. 학점 출력
        int score = 72;
        if (score >= 80 && score < 90) {
            System.out.println("B 학점");
        } else if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("C 학점");
        } else {
            System.out.println("F 학점");
        }

        // Q2번. Q1을 swtich문으로 출력
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A 학점");
                break;
            case 8:
                System.out.println("B 학점");
                break;
            case 7:
                System.out.println("C 학점");
                break;
            default:
                System.out.println("F 학점");
        }

        // Q3번. 0부터 10까지 2씩 증가하는 숫자 출력 (break, continue 이용)
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i > 10) {
                break;
            }
            System.out.println(i);
        }

        // Q4번. for문과 똑같은 기능을 수행하는 while문
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }

        //Q5번. 이중 for문 출력시 A 몇 회 출력?
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 3; j++) {
                if (k == 2){
                    continue;
                }
                if (j == 1) {
                    break;
                }
                System.out.println("A");
            }
        }

        // Q6번. 레이블 사용x i=3, j=2일때 이중 for문 탈출
        for (int a = 0; a < 10; a++) {
            for (int j = 0; j < 5; j++) {
                if (a == 3) {
                    if (j == 2) {
                        a = 10;
                        break;
                    }
                }
                System.out.println(a + ", " + j);
            }
        }

        // Q7번. 레이블 사용o i=3, j=2일때 이중 for문 탈출
        out:
        for (int a = 0; a < 10; a++) {
            for (int j = 0; j < 5; j++) {
                if (a == 3) {
                    if (j == 2) {
                        break out;
                    }
                }
                System.out.println(a + ", " + j);
            }
        }
    }
}
