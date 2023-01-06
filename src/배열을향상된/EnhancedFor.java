package 배열을향상된;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {50, 50, 50};
        int sum =0;
        for(int e : score) {
            e = e + 10;
            sum +=e;

        }
        System.out.println("총점 :"+ sum);
        System.out.printf("평균 : %.2f\n", (double)sum/score.length);

        sum = 0;
        for(int i = 0; i < score.length; i++) {

        }

    }
}
