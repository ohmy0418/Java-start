package loop;

public class Homework6 {
    public static void main(String[] args) {
        int sum =0;
        int max = 100;

        for(int count = 1; count <= max; count++){
            sum = count + sum;
            System.out.println(sum);
        }
    }
}
