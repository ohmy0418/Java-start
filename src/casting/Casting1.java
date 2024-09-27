package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue;

        doubleValue=intValue;
        System.out.println(doubleValue); // 10.0
        doubleValue = (double) intValue; // 형 맞추가
        System.out.println(doubleValue); // 10.0
        doubleValue=(double) 10; // 변수 값 읽기
        System.out.println(doubleValue); // 10.0
        doubleValue = 10.0; // 형 변환
        System.out.println(doubleValue); // 10.0ㄴ
    }
}
