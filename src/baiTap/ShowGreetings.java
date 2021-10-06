package baiTap;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name;
        name=scanner.nextLine();
        System.out.println("xin chào mày "+name);
    }
}
