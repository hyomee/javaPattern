package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

  // 공유 pool
  private Map<String, Flyweight> flyweightMaps = new HashMap<String, Flyweight>();

  public Flyweight getFlyweight(String key) {
    if (flyweightMaps.containsKey(key)) {
      System.out.println("공유 갹채 flyweight key = " + key);
      return flyweightMaps.get(key);
    } else {
      System.out.println("생설 객페 flyweight  key = " + key);
      Flyweight flyweight = new Flyweight1(key);
      flyweightMaps.put(key, flyweight);
      return flyweight;
    }
  }

  public int getSize() {
    return flyweightMaps.size();
  }

}
