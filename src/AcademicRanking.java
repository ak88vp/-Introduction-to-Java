import java.util.Scanner;

public class AcademicRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score : ");
        float score;
        score = scanner.nextFloat();
        if (score <= 5 && score >= 0) {
            System.out.print("Your score is " + score + " Your academic performance is Average.");
        } else if (score < 8) {
            System.out.print("Your score is " + score + " Your academic ability is Good.");
        } else if (score <= 10) {
            System.out.print("Your score is " + score + " Your academic ability is Best Master.");

        }else System.out.print("We can't rate this point");
    }

}
