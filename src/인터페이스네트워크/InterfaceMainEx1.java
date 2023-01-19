package 인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크를 선택 하세요 [1]WIFI [2]%5G [3]LTE :");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                adapter = new WiFi("KT Megapass");
                break;
            case 2:
                adapter = new FiveG("SK Telecom");
                break;
            case 3:
                adapter = new LTE("LG U+");
                break;
            default:
                System.out.println("네트워크를 잘 못 선택 하였습니다");

        }
        adapter.connect();
    }
}
