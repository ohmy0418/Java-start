package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b =" + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b; // int 형은 정수이기 때문에 소수점 이하를 포함할 수 없다. (형변환)
        System.out.println("a / b = " + div);

        int mod = a % b; // 나머지를 구하는 연산자. 5 / 2 몫이 2, 나머지가 1이라 1만 출력한다.
        System.out.println("a & b =" + mod);
    }
}
