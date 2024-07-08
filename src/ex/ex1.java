package ex;

public class ex1 {
    public static void main(String[] args) {
        int score = 90;

        if(score >= 95){
            System.out.println("학점은 A 입니다.");
        } else if (score >= 85){
            System.out.println("학점은 B 입니다.");
        } else if (score >= 75){
            System.out.println("학점은 C 입니다.");
        } else if (score >= 65){
            System.out.println("학점은 D 입니다.");
        } else if (score >= 55){
            System.out.println("학점은 E 입니다.");
        } else{
            System.out.println("학점은 F 입니다.");
        }

    }
}
