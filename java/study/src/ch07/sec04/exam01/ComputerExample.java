package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int radius = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적:" + calculator.areaCircle(radius));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적:" + computer.areaCircle(radius));
    }
}
