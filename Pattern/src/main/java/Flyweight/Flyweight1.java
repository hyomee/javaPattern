package Flyweight;

public class Flyweight1 implements Flyweight{

  private String intrinsicStatus;

  public Flyweight1(String intrinsicStatus){
    this.intrinsicStatus = intrinsicStatus;
  }

  @Override
  public String operation(int extrinsicState) {
    return String.format("Flyweight1 내부상태(intrinsicStatus) = %s, 외부 상태 = %d ",
            intrinsicStatus,
            extrinsicState);
  }
}
