import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
  public static void main(String[] args) throws Exception {
    // Set은 자료를 담되, 중복을 허용하지 않는 자료구조이다.
    // Set은 중복을 허용하지 않고 자료의 순서가 없기 때문에, 데이터의 중복을 거르는 경우에 특히 유용하다.

    // Set 역시 인터페이스이기 때문에, 자체적으로는 인스턴스를 가질 수 없다.
    // 대신, HashSet 등등의 Set 인터페이스를 상속받아 메소드를 구현한 클래스로 다형성을 활용할 수 있다.

    Set<String> stringSet = new HashSet<String>();

    // HashSet에 원소 추가하기
    stringSet.add("Koishi is an aborable Aggie!");

    // Collection에 있는 모든 원소를 HashSet에 추가하기
    stringSet.addAll(List.of("Aggie Koishi", "Aggie Hoshino", "Yasuo", "Maverick"));

    // HashSet에 특정 원소가 있는지 확인하기
    System.out.println(stringSet.contains("Aggie Koishi"));
    System.out.println(stringSet.contains("Koishi"));

    // HashSet이 비어있는지 확인하기
    System.out.println(stringSet.isEmpty());

    // HashSet으로부터 원소 제거하기
    System.out.println(stringSet.contains("Aggie Koishi"));
    stringSet.remove("Aggie Koishi");
    System.out.println(stringSet.contains("Aggie Koishi"));

    // HashSet의 원소 개수 확인하기
    System.out.println(stringSet.size());
  }
}
