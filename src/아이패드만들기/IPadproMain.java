package 아이패드만들기;

public class IPadproMain {
    public static void main(String[] args) throws InterruptedException {

        while (true){
            IpadProMake iPad = new IpadProMake("iPad Pro");
            if(!iPad.continueOder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductPad();
            iPad.inProductPad();
        }
    }

}
