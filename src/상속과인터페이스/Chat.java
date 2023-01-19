//package 상속과인터페이스;
//
//import 인터페이스네트워크.NetworkAdapter;
//
//public class Chat {
//    Chat() {}
//        void sendMsg() {
//            System.out.println("메시지를 보냅니다.");
//        }
//        void rcvMsg(){
//            System.out.println("메세지를 받습니다");
//        }
//    }
//class  WiFi extends Chat implements NetworkAdapter{
//    String  company;
//    String  name;
//    public WiFi(String company, String name){
//        this.company = company;
//        this.name =name;
//    }
//
//    @Override
//    public void connect() {
//        System.out.println(company + "WiFi에 연결 되었습니다");
//    }
//    @Override
//    void  sendMsg(){
//        System.out.println(name + "에게 메세지를 보냅니다");
//    }
//    @Override
//    void  rcvMsg(){
//        System.out.println("으로부터 보냅니다");
//    }
//}
//class  FiveG extends Chat implements NetworkAdapter2 {
//    String company;
//    String name;
//
//    public FiveG(String company, String name) {
//        this.company = company;
//        this.name = name;
//
//        @Override
//        public void connect () {
//            System.out.println(company + "5G에 연결 되었습니다");
//        }
//        @Override
//        void sendMsg () {
//            System.out.println(name + "에게 메세지를 보냅니다");
//        }
//        @Override
//        void rcvMsg () {
//            System.out.println("으로부터 보냅니다");
//        }
//    }
//}