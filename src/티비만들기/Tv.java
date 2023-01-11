//package 티비만들기;
//
//import 문자열.StringType;
//
//public class TV {
//
//        private boolean ison; // 전원버튼, 접근 제한자 private
//        private int channel;   //0~999
//        private int volume; // 0~100
//
//           TV() {
//               ison = false;
//               channel = 10;
//               volume = 10;
//               System.out.printf("기본생성자 호풀, 전원 : %b, 채널 : %d, 볼륨 : %%d\n", ison,cHannel,volume);
//        }
//
//            TV(boolean isON,int cnl,int vol){
//               this.ison =isON;
//               channel =cnl;
//               volume = vol;
//                }
//                // 외부에서 전원 온 오프 할 수 있는 기증을 제공
//                public  void  setON(boolean ison) {
//                    this.ison = ison;
//                    String onffStr = (ison) ? "ON" : "OFF";
//                    System.out.println("TV가 " + onffStr + "되었습니다");
//                }
//                //외부에서 채널을 변경할 수 있는 기능을 제공
//                public  void  setChannel(int cnl) {
//                    if (cnl >= 0 && cnl <= 999) {
//                        channel = cnl;
//                        System.out.println("채널을 " + channel + "로 변경 하였습니다");
//                    } else {
//                        System.out.println("채널 설정 범위가 아닙니다.");
//                    }
//                }
//                public  void  setVolume(int vol) {
//                    if (vol >= 0 && vol <= 100) {
//                        volume = vol;
//                        System.out.println("볼륨을 " + volume + "으로 변경 하였습니다");
//                    } else {
//                        System.out.println("채널 설정 범위가 아닙니다.");
//                    }
//                }
//                public  void  getTv(){
//               String onOffstr = (ison) ? "ON" : "OFF";
//               System.out.println("== tvw정보 ==");
//
//
//                }
//
//
//                }
