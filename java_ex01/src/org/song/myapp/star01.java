package org.song.myapp;

import java.util.Scanner;

public class star01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 줄의 별의 수 입력");
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < cnt - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }

}
