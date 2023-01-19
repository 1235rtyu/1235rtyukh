//package 인터페이스리모컨;
//
//public class Television {
//
//        public class Television implements RemoteControl {
//            private int volume;
//
//            @Override
//            public void turnOn() {
//                System.out.println("Television 를 켭니다");
//            }
//
//            @Override
//            public void turnOff() {
//                System.out.println("Television 를 끕니다");
//            }
//
//            @Override
//            public void setVolume(int volume) {
//                if (volume > RemoteControl.MAX_VOLUME) {
//                    this.volume = RemoteControl.MAX_VOLUME;
//                } else if (volume < RemoteControl.Min_VOLUME) {
//                    this.volume = RemoteControl.Min_VOLUME;
//                } else {
//                    this.volume = volume;
//                }
//                System.out.println("현재 Television 볼륨 : " + this.volume);
//            }
//
//            public void getInfo() {
//                System.out.println("Television 입니다");
//                System.out.println("현재 볼륨은 " + volume + "입니다");
//            }
//        }
//    }
//
