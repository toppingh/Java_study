package Chapter10_Abstract;

class Human {
    String name;
    int age;

    void eat() {}
    void sleep() {}
}

class Student extends Human { // Human 클래스 상속
    int studentID;
    void goToSchool() {}
}

class Worker extends Human { // Human 클래스 상속
    int workerID;
    void goToWork() {}
}

public class _01_Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        Human h = new Human();
        h.name = "김자바";
        h.age = 11;
        h.eat();
        h.sleep();

        // Student 객체 생성
        Student s = new Student();
        s.name = "황자바";
        s.age = 24;
        s.studentID = 2104714; // 추가로 정의한 멤버
        s.eat();
        s.sleep();
        s.goToSchool(); // 추가로 정의한 멤버

        // Worker 객체 생성
        Worker w = new Worker();
        w.name = "이자바";
        w.age = 50;
        w.workerID = 130; // 추가로 정의한 멤버
        w.eat();
        w.sleep();
        w.goToWork(); // 추가로 정의한 멤버
    }
}
