package org.song.myapp;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // 정수를 입력 받고 50000원짜리, 10000원 짜리, 1000원 짜리, 500원 짜리, 100원 짜리, 50원 짜리, 10원 짜리, 1원 짜리 개수를 출력하기
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요.");
        int money = sc.nextInt();
         for(int i = 0; i < unit.length; i++) {
             if(money / unit[i] != 0) {
                 System.out.println(unit[i] + "원 짜리 : " + money / unit[i] + "개");
             }
             money = money % unit[i];

         }
    }
}
