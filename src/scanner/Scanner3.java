package scanner;

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번재 숫자를 입력하세요: ");
        int num3 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num4 = scanner.nextInt();

        if(num3 == num4){
            System.out.println("두 숫자가 같다.");
        } else if(num3 > num4){
            System.out.println(num3);
        } else{
            System.out.println(num4);

        }
    }
}
