package 디형성응용2;

public class Driver {
    String name; // 운전자 이름
    public Driver(String name )   {
        this.name = name ;

    }
    public  void  driver(Vehicle vehicle){
        System.out.println(name + "의");
        vehicle. run();

    }
}

