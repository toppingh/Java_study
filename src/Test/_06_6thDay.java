package Test;
import java.util.Arrays;

// 배열의 평균값
class Solution15 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}

// 배열의 평균값 - 스트림
class Solution16 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
// orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려준다

public class _06_6thDay {
}
