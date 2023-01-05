package q반복분연습2;
// 입력을 5라고 받으면
// *
//**
//***
//****
//*****
import java.util.Scanner;

public class StarprintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("횟수 입력");
        int star = sc.nextInt();
        for (int i = 0; i < star; i++) { //i줄 j행
            for(int j = 0; j <i+1; j++){
                System.out.print("*");
            }
            System.out.println(); // 줄
        }
    }
}