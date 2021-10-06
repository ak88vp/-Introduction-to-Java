import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        float width ;
        float height;
        Scanner scanner= new Scanner(System.in);//khai báo đối tương scaner để làm gì ?
        System.out.println("enter width : " );
        width = scanner.nextFloat();//Nhập chiều rộng
        System.out.println("enter Height : ");
        height =scanner.nextFloat();

        float area=width*height;
        System.out.println("area = "+ area);

    }
}
