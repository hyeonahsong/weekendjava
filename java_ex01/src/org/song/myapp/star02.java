package org.song.myapp;

import java.util.Scanner;

public class star02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 줄의 별의 수 입력");
        String s = sc.next();
        char c = s.charAt(0);
        for(int i = 0; i < c - 'a'; i++) {
            for(int j = 0; j < c - 'a' - i; j++) {
                System.out.print(c - j -'0');
            }
            System.out.println();
        }
        sc.close();
    }

}
