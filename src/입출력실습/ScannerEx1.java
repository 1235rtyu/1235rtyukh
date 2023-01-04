package 입출력실습;

import java.util.Scanner;

// 이름, 주소, 성별, 나이 전화번호를 입력 받아 출력
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("이름을 입력 하세요");
        String name = sc.next();// 문자열을 공백 기준으로 입력 받음
        sc.nextLine();
        System.out.print("주소를 입력 하세요");
        String addr = sc.nextLine();//문자열을 줄바꿈 기준으로 입력 받음
        System.out.print("성별을 입력 하세요");
        char gender = sc.next().charAt(1); //문자열에서 첫번째 문자를 입력 받음
        System.out.print("나이를 입력 하세요");
        int age = sc.nextInt();

        System.out.println("-----------------호원 정보 출력---------------");
        System.out.println("이름:" + name);
        System.out.println("주소:" + addr);
        System.out.println("성별:" + gender);
        System.out.println("나이:" + age);
    }

}
