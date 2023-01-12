package 홀수짝수나누어담기;

import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

// 7개 정수를 입력 받음
// 정수 입력 : 1 2 3 4 5  6 7
//홀수 1 3 5 7
//짝수 2 4 6
public class oddEvenSeparator {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    // 7개의 정수를 입력 받음
    void  inputArray(){
        Scanner sc =new Scanner(System.in);
        int value = 0;
        System.out.print("정수 입력 :");
        while (true){
            value = sc.nextInt();
            if(value == 999) break;
            inList.add(value); // 값을 추가


        }

    }

    // 홀수 / 짝수 나누어 담기
    void  separatorArray(){
    for(int e : inList){
        if(e % 2==0) evenList.add(e);
        else  oddList.add(e);
    }
    }
    // 홀수 / 짝수 배열 출력
    void  printArray(){
        System.out.println("홀수 :");
        for(int e : oddList) System.out.println(e + "");
        System.out.println();

        System.out.println("짝수 :");
        for(int e : evenList) System.out.println(e + "");

    }
}

