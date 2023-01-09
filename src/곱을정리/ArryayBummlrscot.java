package 곱을정리;
// 1차원 배명ㄹ을 이용한 버블 정렬: 가장 비효율 적이지만 구현하기 쉬운 정렬 방식
public class ArryayBummlrscot {
    public static void main(String[] args) {
    int[] arr = {9,4,33,100,5,8,7,6,2,1};
    int tmp = 0;
    for(int i = 0; i <arr.length; i++) {
        for(int j = i; j <arr.length; j++) {
            if(arr[i] > arr[j]) {
                tmp =arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
    }
        for(int e : arr) System.out.print(e + " ");
    }

}
