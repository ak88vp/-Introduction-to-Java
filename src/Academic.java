import java.util.Scanner;

public class Academic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score : ");
        float score;
        score = scanner.nextFloat();
        System.out.println(academic(score));
    }

    public static String academic(float score) {
        if (score <= 5 && score >= 0) {
            return "Your score is " + score + " Your academic performance is Average.";
        } else if (score < 8) {
            return "Your score is " + score + " Your academic ability is Good.";
        } else if (score <= 10) {
            return "Your score is " + score + " Your academic ability is Best Master.";

        }
        return "We can't rate this point";

    }

}
