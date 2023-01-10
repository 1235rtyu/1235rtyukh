package 간판만들기;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1운 2칸 나머지 수는 3칸을 차지
// 간판의 각 굿자 사이는 1칸의 여백이 필요
//총 입력한 숫자를 표기하기 위해 몇 칸의 공간이 필요한지 계산하는 문제
// 5611 = 처음 한칸 +3 +1 +3 +1 =2 +1 = 15칸
//120_ 1 + 2 +1 + 3 + 1 + 4 +1 =15
;//입력은 0이 들어 올때 까지 계속 반복 입력이 가능하게 해야 함.(종료 조건)
public class SignBoardMake {
    public static void main(String[] args) {
        int[] numberSize = {4,2,3,3,3,3,3,3,3,3,3};
        Scanner sc =new Scanner(System.in);
        String signNumber; //문자열 입력 받는 변수
        int sum = 0; //총 몇자리의 공간을 차지하는지 누적하는 변수
        while(true) {
            signNumber = sc.next();
            if(signNumber.equals("0")) break;
            for(int i = 0; i < signNumber.length(); i++){
                sum += numberSize[signNumber.charAt(i)-'0'] + 1;
            }
            System.out.println(sum + 1);
            sum = 0; // 썸값을 항상 초기화


        }


    }
    
}
