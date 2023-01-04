package 최대값;

import java.util.Scanner;

// 3자리 정수를 입력 받아서 100자리 , 10자리 1자리로 나누어 담고 이중 가장 큰 수 찾기
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 정수를 입력 받기 위해 스캐너 객체 생성
        System.out.print("세자리 정수를 입력 하세요");
        int number = sc.nextInt(); //키보드로 부터 입력 받은 값을 변수에 담음
        int a = number / 100; // 100으로 나눈 몫을 넣어 줌
        int b = (number % 100) / 10; // 100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫을 넣어줌
        int c = number & 10; //10을 나눈 나머지를 넣어 줌
        if(a > b){
            if(a > c) System.out.println(a);
            else System.out.println(c);
        }else {
            if(b > c) System.out.println(b);
            else  System.out.println(c);
        }
    }
}
