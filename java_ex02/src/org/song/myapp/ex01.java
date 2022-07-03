package org.song.myapp;

public class ex01 {

    public static void main(String[] args) {

        // String[] song = new String[4];
        // String[] group1 = {"송현아", "송현이", "송형아"};
        // int[][] n = new int[5][];


        int[][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        for(int i = 0; i < n.length; i++) {
            for(int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }

    }

}
