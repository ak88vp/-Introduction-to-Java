package baiTap;

import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        String[] str = {" không ", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        String[] str1 = {" mươi ", "một", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
        String[] str2 = {" mươi ", "mốt", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
        String[] str3 = {" linh ", "mười", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String res="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        if (number>=0&&number<11){
            res=str[number];
        }else if (number<20){
            int hangDV=number%10;
            res="mười "+str1[hangDV];
        }else if (number<100) {
            int hangDV=number%10;
            int hangC=number/10;
            res=str[hangC]+" "+str2[hangDV];
        }else if (number<1000){
          int hangTR=number/100;
          int haiCS=number%100;
          int hangC=haiCS/10;
          int hangDV=haiCS%10;
          res=str1[hangTR]+" trăm "+str3[hangC]+" "+str2[hangDV];

        }

        System.out.println(res);
    }
}
