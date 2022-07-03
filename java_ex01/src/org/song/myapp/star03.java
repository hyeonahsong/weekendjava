package org.song.myapp;

import java.util.Scanner;

public class star03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];

        for(int i = 0; i < 10; i++) {
            int no = sc.nextInt();
            list[i] = no;
        }
        int three = 0;
        for(int j = 0; j < list.length; j++){
            if(list[j] % 3 == 0) {
                System.out.print(list[j] + " / ");
            }
        }


    }

}
