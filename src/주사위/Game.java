package 주사위;

public class Game {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;
        while(true) {
            cnt++;
            rand1 = (int)  (Math.random() *  6) + 1; //램덤 함수는 실수형으로 값이 새성되므로 형변환이 필요
            rand2 = (int)  (Math.random() *  6) + 1;
            if((rand1 +rand2) == 12) {
                System.out.printf("무인도를 %d" +
                        "번만에 탈출 합니다\n",cnt);
                break;
            }else{
                    System.out.println("주사위의 합이 " +(rand1 + rand2)+ "입니다");
                }
            }
        }

    }
