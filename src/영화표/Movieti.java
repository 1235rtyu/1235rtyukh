package 영화표;

//현재 좌석 상태를 보여주는 매소드가 필요
//좌석을 예매하는 메소드가 필요
//판매된 좌석의 개수를 구해 총 판매 금액을 구하는 매소드가 필요

//극장의 좌석 상태를 배열 만들기(총10개)
//현재 좌석 상태를 보여주는  메소드 작성
// 0이면 [] 1이면[v}

import java.util.Scanner;

public class Movieti {
        int seat[] = new int[10];

        int totalAmount() {
            int cnt = 0; //예약된 좌석의 수를 누적하는 변수 생성
            //좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
            for(int val : seat) {
                if (val == 1) cnt++; //예약된 좌석 개수를 누적
            }
            return cnt * 12000;
        }
        void printSeat() {
            for(int i = 0; i < seat.length; i++) {
                if(seat[i] == 0) System.out.print("[ ]");
                else System.out.print("[V]");
            }
            System.out.println();
        }
        void selectSeat() {
            printSeat();
            Scanner sc = new Scanner(System.in);
            System.out.print("좌석 번호를 입력 하세요. : ");
            int seatPos = sc.nextInt();
            if(seat[seatPos-1] == 0) {
                seat[seatPos-1] = 1;
                printSeat();
            } else System.out.println("이미 예약된 좌석 입니다. 다른 좌석을 선택 하세요.");
        }
    }



// 좌석응 예약하는 메소드
// prinstesat 호풀해 현재 좌석 상태를 보여줌
// 좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 구문 출력
// 좌석 예약이 성공하면 다시 pritseat()를 호출해 좌석 상태를 보여줌
//좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를  누적
// 좌석 개수와 좌석당 가격을 곱해서 결과를 반환

