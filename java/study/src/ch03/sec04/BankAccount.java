package ch03.sec04;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("-----------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("입금할 금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println(deposit + "원이 입금되었습니다.");
                    } else {
                        System.out.println("잘못된 금액입니다.");
                    }
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println(withdraw + "원이 출금되었습니다.");
                    } else {
                        System.out.println("출금할 수 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔고는 " + balance + "원입니다.");
                    break;
                case 4:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }
        }

        scanner.close();
    }
}
