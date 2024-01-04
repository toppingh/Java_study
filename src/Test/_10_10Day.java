package Test;

// 아이스 아메리카노 (내 풀이) => if문은 필요없음!!
class Solution27 {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        if (5500 % money == 0) {
            answer[0] += 1;
        } else {

            answer[0] = money / 5500;
            answer[1] = money % 5500;
        }
        return answer;
    }
}

// 아이스 아메리카노 -> 간단 ver
class Solution28 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}

// 아이스 아메리카노 -> 더 간단 ver
class Solution29 {
    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}

public class _10_10Day {
}
