//package 인터페이스리모컨;
//
//public class Audio implements RemoteControl{
//    private int volume;
//    @Override
//    public void turnOn() {
//        System.out.println("Audio 를 켭니다");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Audio 를 끕니다");
//    }
//
//    @Override
//    public void setVolume(int volume) {
//        if(volume > RemoteControl.MAX_VOLUME){
//            this.volume = RemoteControl.MAX_VOLUME;
//        }else if(volume < RemoteControl.Min_VOLUME){
//            this.volume = RemoteControl.Min_VOLUME;
//        }else {
//            this.volume = volume;
//        }
//        System.out.println("현재 Audio 볼륨 : " + this.volume);
//    }
//    public void getInfo(){
//        System.out.println("Television 입니다");
//        System.out.println("현재 볼륨"+ volume +"입니다");
//
//    }
//
//    public Audio(int volume) {
//        this.volume = volume;
//        if (mute) System.out.println("무음 처리");
//        else System.out.println("무음 해제 합니다");
//    }
//}
//
//
