package org.song.myapp;

import java.util.Scanner;

public class star06 {
    static Scanner sc = new Scanner(System.in);

    static int[] list;
    static public void mkList(int length) {
        if(length > 99 || length < 1) {
            System.out.println("잘못된 숫자를 입력하였습니다.");
            int newLength = sc.nextInt();
            mkList(newLength);
        } else {
            list = new int[length];
        }

    }



    public static void main(String[] args) {
        System.out.println("몇 개의 숫자를 저장하시겠습니까?");
        int length = sc.nextInt();
        mkList(length);

        int maxNo = 0;
        for(int i = 0; i < list.length; i++) {
            int randomNo = (int)(Math.random() * 10 + 1);
            System.out.println(randomNo);
            for(int j = 0; j < maxNo; j++) {
                if(randomNo == list[j]) {
                    i--;
                } else {
                    list[i] = randomNo;
                }
            }
        }

        System.out.print("입력된 정수들: ");

        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }

}
