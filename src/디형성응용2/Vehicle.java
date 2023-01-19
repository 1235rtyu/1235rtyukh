package 디형성응용2;

public class Vehicle {
    public void  run(){
        System.out.println("자동차가 달린다");

    }

}
class  SportsCar extends  Vehicle{
    @Override
    public void  run(){
        System.out.println("스포츠카가 달립니다");

    }
}
class Bus extends  Vehicle {
    @Override
    public  void  run(){
        System.out.println("버스가 달립니다");
    }
}

class  Truck extends  Vehicle{
    @Override
    public void  run(){
        System.out.println("트럭이 달립니다");
    }
}
