package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        // "클래스 변수 = new 클래스명();"
        Car myCar = new Car();
        Car myCar2= new Car();

        System.out.println("모델명:" + myCar.model);
        System.out.println("시동여부:" + myCar.start);
        System.out.println("현재속도:"+ myCar.speed);

        // myCar 객체의 speed 필드 값을 120으로 변경, 출력
    myCar.speed=120;
        System.out.println(myCar.speed);
        //myCar2 객체의 speed 필드 값을 140으로 변경, 출력
    myCar2.speed=140;
    System.out.println(myCar2.speed);
    }
}
