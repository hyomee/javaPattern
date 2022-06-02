package Flyweight;

public class Client {
  public static void main(String[] args) {

    // Factory 생성
    FlyweightFactory flyweightFactory = new FlyweightFactory();

    Flyweight flyweight0 = flyweightFactory.getFlyweight("A");
    System.out.println(flyweight0.operation(100));

    Flyweight flyweight1 = flyweightFactory.getFlyweight("A");
    System.out.println(flyweight1.operation(200));

    Flyweight flyweight2 = flyweightFactory.getFlyweight("B");
    System.out.println(flyweight2.operation(300));

    System.out.println(String.format("*** 생성된 Flyweight1 갯수 %d ***",   flyweightFactory.getSize()));

    System.out.println(String.format("*** flyweight0 주소 =  %s", System.identityHashCode(flyweight0)));
    System.out.println(String.format("*** flyweight1 주소 = %s", System.identityHashCode(flyweight1)));
    System.out.println(String.format("*** flyweight2 주소 = %s", System.identityHashCode(flyweight2)));
  }
}
