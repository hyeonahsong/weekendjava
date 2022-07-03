package org.song.myapp;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String msg1 = sc.nextLine();

        for(int i = 0; i < msg1.length(); i++) {
            String msg2 = msg1.substring(0, 1);
            String msg3 = msg1.substring(1, msg1.length());
            msg1 = msg3 + msg2;
            System.out.println(msg1);
        }
    }
}
