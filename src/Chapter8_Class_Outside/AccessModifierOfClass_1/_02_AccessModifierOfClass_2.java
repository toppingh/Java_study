package Chapter8_Class_Outside.AccessModifierOfClass_1;

import Chapter8_Class_Outside.AccessModifierOfClass_2.AA; // public 접근 지정자를 포함하므로 임포트 가능!
//import Chapter8_Class_Outside.AccessModifierOfClass_2.BB; // 불가능
import Chapter8_Class_Outside.AccessModifierOfClass_2.CC; // public 접근 지정자를 포함하므로 임포트 가능!

public class _02_AccessModifierOfClass_2 {
    public static void main(String[] args) {
        // 객체 생성
        AA a = new AA(); // public 생성자이므로 다른 패키지에서도 객체 선언(AA a)과 생성자 호출(new AA()) 가능
//        BB b = new BB(); // 임포트 할 수 없으므로 객체 선언과 생성자 호출 모두 불가능
//        CC c = new CC(); // 객체는 선언할 수 있지만(CC c), default 생성자이므로 생성자 호출(new CC()) 불가능
    }
}
