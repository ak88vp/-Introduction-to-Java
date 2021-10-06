import java.util.Scanner;

public class WeightIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter weight :");
        double weight;
        weight=scanner.nextDouble();
        System.out.println("Enter Height");
        double height;
        height=scanner.nextDouble();
        double BMI;
        BMI=weight/(height*height);
        if (BMI<18.5){
            System.out.println( BMI+"Underweight");
        }else if(BMI<25){
            System.out.println(BMI+"Normal");
        }else if(BMI<30){
            System.out.println(BMI+"Overweight");
        }else if (BMI>=30){
            System.out.println(BMI+"Obese");
        }

    }
}
