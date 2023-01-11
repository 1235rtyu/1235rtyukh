package 영화표;

import java.util.Scanner;

//영화표 예매하기 클래스를 만들고 객체 생성
//극장의 자석은 10개(10개의 좌석 예약 상태를 기록하기 배열필요)
// 좌석당 가격은 12000원
//메뉴는 예약하기와 종료로 구성
//예양하기에서는 현재 좌석의 예약 상태를 보여주고 예약을 받음
// 종료는 판매된 좌석의 개수를 확인해서 팬매 금액을 구함
public class MovieMain {
    public static void main(String[] args) {
        Movieti ticket = new Movieti();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]종료");
            int selMenu = sc.nextInt(); //메뉴 선택에 대한 값을 입력 받음
            if (selMenu == 1) ticket.selectSeat(); // 좌석 예약하기에 대한 메소드 호출
            else {
                System.out.println(ticket.totalAmount()); // 종류하기 선택 시 판매금액 계산
                break;
            }
        }
    }
}
