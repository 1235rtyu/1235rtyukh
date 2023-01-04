package 조건연습;

import java.util.Scanner;

// 성적을 입력 받음
// 입력 받은 값이 0~100 사이가 아니면 "잘못 입력 하였습니다" 출력
// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C. 60이상 D, 나머지 F,
public class ScoreGrade {
    public static void main(String[] args) {
        //스캐너 객체 생성
        //생성된 객체에서 정수값을 입력 받음
        //조건문에서 값이 0~100사이인 경우 해당 학점 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력 하세요");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 소문자 입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 대문자 입니다.");
        } else {
            System.out.println("영문자가 아닙니다.");
        }
    }
}
