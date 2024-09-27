package casting;

public class Casting2 {
    public static void main(String[] args) {
        int intValue = 0;
        double doubleValue = 1.5;

        // intValue = doubleValue;//컴파일 오류 발생
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
