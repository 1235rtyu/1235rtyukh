package 두번쨰숫자찾기;

import java.util.Scanner;

//임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기 : 1 2 3 4 5 1 2 3 4 5
// 5===>10
//임의의 수 입력 : 1 2 3 4 5 5 6 7 8 2
//찾을 수 : 5
//결과 : 6
// 만약에 2번째 등장하는수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0; // 몇번째 나타는 수인지 확인
        System.out.print("임의의 수(10개) :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();// 입력 받은 각각의 임의의 수를 배열에 대입
        }
        System.out.print("찾을 수 입력 : ");
        int secondNum = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == secondNum) {
                cnt++;
                if(cnt == 2){
                    System.out.print(i+1);
                    break;
                }
            }
        }
        if(cnt < 2) System.out.println("-1");
    }
}
