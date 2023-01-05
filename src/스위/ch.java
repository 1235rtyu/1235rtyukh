package 스위;

import java.util.Scanner;

public class ch {
    public static void main(String[] args) {
        int x, y;
        char op;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        op = sc.next().charAt(0);
        y = sc.nextInt();
        switch (op) {
            case '+':
                System.out.printf("SUM : %d\n", x + y);
                break;
            case '-':
                System.out.printf("SUB : %d\n", x - y);
                break;
            case '*':
                System.out.printf("MUL : %d\n", x * y);
                break;

            default:
                System.out.println("조건식이 없습니다.");
        }
    }
}
