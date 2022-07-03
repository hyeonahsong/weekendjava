package org.song.myapp;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("출력하고 싶은 별의 개수를 입력하세요.");
        int star = sc.nextInt();

        for(int i = 0; i < star; i++) {
            for(int j = 0; j < star-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }

}
