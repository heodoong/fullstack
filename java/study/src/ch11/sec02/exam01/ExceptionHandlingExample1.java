package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수" + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

// 12번째 줄에서 printLength(null); 를 호출하면 data가 null이기 때문에
// data.length() 호출 시 NullPointerException이 발생함. 이를 방지하기
// 위해 예외 처리를 해야한다.
