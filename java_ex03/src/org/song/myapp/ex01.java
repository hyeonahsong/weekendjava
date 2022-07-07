package org.song.myapp;

import java.util.Scanner;

// 세 과목 점수 입력받고 평균값 구해주기!(객체 활용)
class Grade {

    private int kor;
    private int eng;
    private int math;

    // 생성자
    public Grade(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    } // 생성자

    // 평균 계산해주는 친구.
    public int average() {
    return (this.kor + this.eng + this.math)/3;
} // average

}

public class ex01 {

    public static void main(String[] args) {
// 과목 별 점수 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("국어, 영어, 수학 순으로 3개의 정수 입력 >> ");
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();

        Grade me = new Grade(kor, eng, math);
        System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴

        sc.close();

    }

    //  수학, 과학, 영어 순으로 3개의 정수 입력 >> 90 88 96
    //  평균은 91
}
