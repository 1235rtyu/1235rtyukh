package 중첩어래이;

public class DoubledArrayex {
    public static void main(String[] args) {
        int[][] arr = new int[2] [3];
        int k = 10;
        for (int i = 0; i <arr.length; i++) {//행의 갯수를 알수 있음
            for(int j = 0; j <arr[i].length; j++){
                arr[i] [j] = k;
                k+= 10;
        }
        }
    }
    }
