package 클래스다이어그램;
//클래스 다이어그램(Circle)
// + PI : double = 3.14 => public static final PI = 3.14
// - radius : double => private double radius;
// +Circle( radius:double) = > public Circle(double radius)
public class ClassDiagram {
    public static void main(String[] args) {
       Circle circle = new Circle(20.0); //객체 생성 시 생성자의 매개변수를 넣어야 함
        circle.setRadius(3.1);
        circle.draw();

    }
}
class Circle {
    public  final  static double PI = 3.14;
    private double radius; //접근 제한자 확인 필요(- 는 private 을 의미 함)
    public Circle(double radius) { // 생성자 호출 시 매개변수가 필요 함.
        this.radius = radius;


    }
    public  double getRadius() {
        return  radius;
    }
    public void  setRadius(double radius){
        this.radius = radius;
    }
    public static double getPi() {
        return  PI;

    }
    public  void  draw() {
        System.out.println("반지름 " + radius + "cm인 원을 그립니다");
    }
}
