package if2;

import java.util.Scanner;

public class ConditionF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력 하세요");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 소문자 입니다.");
        }else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 대문자 입니다.");
        }else {
            System.out.println("영문자가 아닙니다.");
        }
    }
}
