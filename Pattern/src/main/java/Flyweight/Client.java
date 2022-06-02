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

    System.out.println(String.format("\n *** 생성된 Flyweight1 갯수 %d ***",
            flyweightFactory.getSize()));

    System.out.println(String.format("\n *** flyweight0 주소 = %s ***",
            System.identityHashCode(flyweight0)));

    System.out.println(String.format("\n *** flyweight1 주소 = %s ***",
            System.identityHashCode(flyweight1)));

    System.out.println(String.format("\n *** flyweight2 주소 = %s ***",
            System.identityHashCode(flyweight2)));


    flyweightAsSingleton();

  }

  static void flyweightAsSingleton() {

    FlyweightFactory flyweightFactory01 = new FlyweightFactory();
    FlyweightFactory flyweightFactory02 = new FlyweightFactory();

    System.out.println(String.format("\n *** flyweightFactory01 주소 = %s ***",
            System.identityHashCode(flyweightFactory01)));
    System.out.println(String.format("\n *** flyweightFactory02 주소 = %s ***",
            System.identityHashCode(flyweightFactory02)));

    flyweightFactory01.setStr("안녕");
    System.out.println(String.format("\n flyweightFactory01  str = %s \n flyweightFactory02  str = %s",
            flyweightFactory01.getStr(), flyweightFactory02.getStr()));

    FlyweightSingletonFactory flyweightSingletonFactory01 = FlyweightSingletonFactory.getInstance();
    FlyweightSingletonFactory flyweightSingletonFactory02 = FlyweightSingletonFactory.getInstance();
    System.out.println(String.format("\n *** flyweightSingletonFactory01 주소 = %s ***",
            System.identityHashCode(flyweightSingletonFactory01)));
    System.out.println(String.format("\n *** flyweightSingletonFactory02 주소 = %s ***",
            System.identityHashCode(flyweightSingletonFactory02)));

    flyweightSingletonFactory01.setStr("안녕");
    System.out.println(String.format("\n flyweightSingletonFactory01  str = %s \n flyweightSingletonFactory02  str = %s",
            flyweightSingletonFactory01.getStr(), flyweightSingletonFactory02.getStr()));

  }
}
