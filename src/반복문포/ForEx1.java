package 반복문포;

import java.util.Scanner;

// for 반복문 : for(초기식;조건식;증감식) { 반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력");
        int number = sc.nextInt();
        int sum = 0;
//        while (number > 0) {
//            sum += number;
//            number--;
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("정수의 합은 : " + sum);
    }
}


