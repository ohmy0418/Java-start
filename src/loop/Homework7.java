package loop;

public class Homework7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(j);
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }

    }
}
