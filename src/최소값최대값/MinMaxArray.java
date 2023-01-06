package 최소값최대값;

import java.util.Scanner;

//정수 값 입력
//입력된 정수 범위의 임의의 값 입력해서 배열 생성
//해당 배열에서 제일 작은 값 과 제일 큰 값 찾기
//정수 값 입력 : 10
//1 3 5 7 2 4 10 10 20 15
// 결과는 MIN:1
// MAX : 20
public class MinMaxArray {
    public static void main(String[] args) {
        //키보드 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 갯 수 입력 하세요");
        //정수값 입력 받음
        int arrNum = sc.nextInt();
        //입력 받은 변수의 크기만큼 배열을 생성
        int[] arr = new int[arrNum];
        //생성된 배열 갯수 만큼 순회 하면서 정수값을 입력 받음
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 갑을 비교하기 위해서 기준 값이 필요한데 배열 0번째 값을 기준값으로 저장
        int min = arr[0];
        int max = arr[0];
        // 배열에서 제일 작은 값과 제일 큰값을 찾음
        for (int e : arr) {
            if (min > e) min = e;
            if (max < e) max = e;
            for (int i = 0; i < arr.length; i++) {
                //for(int i = 0; i < arr.length; i++){
                //if(min > arr[i]) min = arr[i];
                //if(min < arr[i]) min = arr[i];  이것도 ㄱㅊ
            }
            //출력
            System.out.println("최소 갑: " + min);
            System.out.println("최대값 :" + max);

        }
    }
}
