package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int sum = 0;

        while (true) {
            System.out.println("원하는 숫자를 입력하시오: ");

            int userInputNum = scanner.nextInt();

            if (userInputNum == 0) {
                System.out.println("프로그래믈 종료합니다.");
                break;
            }

            sum += userInputNum;

        }
        System.out.println("모든 정수의 합: " + sum);
    }
}
