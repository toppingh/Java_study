package Chapter10_Abstract;

// 클래스의 상속 관계
class AA {}
class BB extends AA {}
class CC extends BB {}
class DD extends BB {}

public class _03_Typecasting_1 {
    public static void main(String[] args) {
        // 업캐스팅(자동 변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
        AA ac = (AA) new CC(); // CC -> AA 업캐스팅(자동 변환)
        BB bc = (BB) new CC(); // CC -> BB 업캐스팅(자동 변환)

        BB bb = new BB();
        AA a = (AA) bb; // BB -> AA 업캐스팅(자동 변환)

        // 다운 캐스팅(수동 변환): 캐스팅할 수 없을 때(실행할 때 예외 발생)
        AA aa = new AA();
//        BB b = (BB) aa; // AA -> BB 다운 캐스팅(수동 변환): 불가능
//        CC c = (CC) aa; // AA -> CC 다운 캐스팅(수동 변환): 불가능

        // 다운 캐스팅(수동 변환): 캐스팅이 가능할 때
        AA ab = new BB();
        BB b = (BB) ab;  // A -> B 다운 캐스팅(수동 변환)
        CC c = (CC) ab; // A -> C 다운 캐스팅(수동 변환): 불가능

        BB bd = new DD();
        DD d = (DD) bd; // B -> D 다운 캐스팅(수동 변환)

        AA ad = new DD();
        BB b1 = (BB) ad; // A -> B 다운 캐스팅(수동 변환)
        DD d1 = (DD) ad; // A -> D 다운 캐스팅(수동 변환)
    }
}
