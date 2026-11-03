import java.util.HashMap;
import java.util.Map;

public class Maps {
  public static void main(String[] args) throws Exception {
    // Map은 순차적으로 구성된 List 자료구조와는 달리, 키(key)와 값(value) 한 쌍씩 저장되는 형태의 자료구조이다.

    // Map은 key의 중복을 허용하지 않고, key가 겹치지 않으면 동일한 value를 가질 수 있다.

    // Map 역시 인터페이스이기 때문에, 자체적으로는 인스턴스를 가질 수 없다.
    // 대신, HashMap 등등의 Map 인터페이스를 상속받아 메소드를 구현한 클래스로 다형성을 활용할 수 있다.

    // HashMap
    Map<String, String> stringMap = new HashMap<String, String>();

    // HashMap에 자료 추가하기 (자료 수정의 기능 포함)
    stringMap.put("514", "Aggie Koishi");
    stringMap.put("123", "Aggie Hoshino");
    stringMap.put("514", "Koishi");

    // HashMap에 특정 key가 있는지 확인하기
    System.out.println(stringMap.containsKey("514"));
    System.out.println(stringMap.containsKey("102"));

    // HashMap에 특정 value가 있는지 확인하기
    System.out.println(stringMap.containsValue("Koishi"));
    System.out.println(stringMap.containsValue("Hoshino"));

    // HashMap에 특정 key에 해당하는 value 가져오기 (없을 경우 null)
    System.out.println(stringMap.get("514"));
    System.out.println(stringMap.get("123"));
    System.out.println(stringMap.get("102"));

    // HashMap의 자료 쌍 수 확인하기
    System.out.println(stringMap.size());

    // HashMap에 특정 key에 해당하는 자료 제거하기
    stringMap.remove("514");
    System.out.println(stringMap.get("514"));

    // HashMap에 특정 key가 존재하고 그 value가 두번째 파라미터에 해당될 경우 자료 제거하기
    stringMap.remove("123", "Hoshino");
    System.out.println(stringMap.get("123"));
    stringMap.remove("123", "Aggie Hoshino");
    System.out.println(stringMap.get("123"));

    // HashMap에 특정 key가 존재할 경우 새로운 value로 바꾸기
    stringMap.put("514", "Aggie Koishi");
    stringMap.put("123", "Aggie Hoshino");
    stringMap.replace("514", "Koishi");
    System.out.println(stringMap.get("514"));

    // HashMap에 특정 key가 존재하고 그 value가 두번째 파라미터에 해당될 경우 새로운 value로 바꾸기
    stringMap.replace("123", "Hoshino", "Hoshino Takanashi");
    System.out.println(stringMap.get("123"));
    stringMap.replace("123", "Aggie Hoshino", "Hoshino Takanashi");
    System.out.println(stringMap.get("123"));

    // HashMap이 비어있는지 확인하기
    System.out.println(stringMap.isEmpty());

    // HashMap의 모든 데이터를 비우기
    stringMap.clear();
    System.out.println(stringMap.isEmpty());

    // HashMap은 자료의 순서가 정해져 있지 않다.
    // Map의 특성을 가지면서도 자료의 순서를 지키는 Map을 사용하려면, LinkedHashMap을 사용하거나 TreeMap을 사용하면 된다.
    // LinkedHashMap은 자료가 먼저 들어온 대로 순서를 지키며, TreeMap은 이진 검색 트리를 기반으로 key 값의 정렬 기준으로 순서를 형성한다.
  }
}
