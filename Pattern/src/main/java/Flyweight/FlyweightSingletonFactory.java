package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightSingletonFactory {

  private String str ;

  public void setStr(String str) {
    this.str = str;
  }

  public String getStr() {
    return str;
  }



  private static final FlyweightSingletonFactory INSTANCE = new FlyweightSingletonFactory();
  private FlyweightSingletonFactory() { }
  public static FlyweightSingletonFactory getInstance() {
     return INSTANCE;
  }

  // 공유 pool
  private Map<String, Flyweight> flyweightMaps = new HashMap<String, Flyweight>();

  public Flyweight getFlyweight(String key) {
    if (flyweightMaps.containsKey(key)) {
      System.out.println("\n 공유 객체 flyweight key = " + key);
      return flyweightMaps.get(key);
    } else {
      System.out.println("\n 생성 객체 flyweight  key = " + key);
      Flyweight flyweight = new Flyweight1(key);
      flyweightMaps.put(key, flyweight);
      return flyweight;
    }
  }

  public int getSize() {
    return flyweightMaps.size();
  }

}
