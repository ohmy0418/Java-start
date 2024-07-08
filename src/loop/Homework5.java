package loop;

public class Homework5 {
    public static void main(String[] args) {
        int max = 100;

        int sum =0;
        int count = 1;

        while(count <= max){
            sum = count + sum;
            count++;
            System.out.println(sum);
        }
    }
}
