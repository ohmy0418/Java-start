package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해 주세요: ");
        int guguNum = scanner.nextInt();

        System.out.println(guguNum + "단의 구구단: ");

        int cnt = 1;
        while(cnt < 10){

            System.out.println(guguNum + " x " + cnt + " = " + (guguNum * cnt));

            cnt++;

        }
    }
}
