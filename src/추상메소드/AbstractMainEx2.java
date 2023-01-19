package 추상메소드;

public  class AbstractMainEx2 {
    public static void main(String[] args) {
        Phone phone =new SmartPhone("Galaxy s22");
        phone.setPower(true);// 부모가 가지고 있는 메소드
        phone.call();//부모의 요청을 자식이 구현함
        phone.internet();
    }

    }


