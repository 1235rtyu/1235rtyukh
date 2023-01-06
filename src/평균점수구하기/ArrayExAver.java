package 평균점수구하기;

import java.util.Scanner;

//상현이가 가르치는 학생은 5명(안유진,유나,채원,카즈하,장원영)
//기말고사를 치고 성적이 40점 미만인 경우 보충학습을 듣는 조건을 40점으로 성적을 조정 해줌
// 모드는 학생이 보충학습을 들음.
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0점 이상이고, 100점 이하인 5의 배수이다.
public class ArrayExAver {
    public static void main(String[] args) {
        //스캐너 객체를 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("5명의 점수를 입력하세요");
        //5명의 성적으로 저장하기 위한 배열 생성
        int arrNum = sc.nextInt();
        int[] score = new int[5];
        int total = 0;
        //배열을 순회하면서 5명의 성적을 입력 받으면서 성적이 40점 미만이면 40점으로 올려 줌
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40) score[i] = 40;

            //평균을 구하기 위해서 성적으로 모두합산 함
            total += score[i];
        }
        //합산된 성적으로 인원수로 나눈어 평균을 구함.
        System.out.println(total/5);
    }
}
