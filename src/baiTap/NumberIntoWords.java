package baiTap;

import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");

        int number=sc.nextInt();
       String mot="một";
       String hai="hai";
       String ba="ba";
       String bon="bốn";
       String nam="năm";
       String sau="sáu";
       String bay="bảy";
       String tam="tám";
       String chin="chín";
       String muoi1="mười";
       String muoi="mươi";
       String tram="trăm";
       String linh="linh";
       String show;
       if (number<10&&number>0){
           switch (number){
               case 1:{
                   System.out.println(mot);
                   break;
               }
               case 2:{
                   System.out.println(hai);
                   break;
               }
               case 3:{
                   System.out.println(ba);
                   break;
               }
               case 4:{
                   System.out.println(bon);
                   break;
               } case 5:{
                   System.out.println(nam);
                   break;
               }
               case 6:{
                   System.out.println(sau);
                   break;
               }
               case 7:{
                   System.out.println(bay);
                   break;
               }
               case 8:{
                   System.out.println(tam);
                   break;
               }
               case 9:{
                   System.out.println(chin);
                   break;
               }

           }
       }
       else if(number<20){
           switch (number){
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:{

               }
           }
       }




    }
}
