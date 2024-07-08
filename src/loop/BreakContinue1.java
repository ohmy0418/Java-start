package loop;

public class BreakContinue1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;

        while (true) {
            sum = sum + count;
            if (sum > 1000) {
                System.out.println("합이 10 보다 크면 종료: i = " + count + " sum = " + sum);
                break;
            }
            count++;
        }
    }
}
