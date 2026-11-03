import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) throws Exception {
        // 배열(Array)의 한계: 배열은 고정된 크기로밖에 초기화하지 못한다.
        // 이처럼 크기를 미리 알 수 없는 여러 자료를 다룰 때, List 자료형을 이용하는 것이 좋다.
        // List에는 대표적으로 ArrayList가 있다.

        // List
        // List는 인터페이스로, 자체만으로는 인스턴스를 생성할 수 없다.
        // 대신 상속받아 메소드를 구현한 클래스들(대표적으로 ArrayList, LinkedList)로 다형성을 활용할 수 있다.

        // ArrayList
        // List 인터페이스를 상속받아 구현된 클래스 중 하나이다.
        // 일반 배열처럼 인덱스는 0부터 시작한다.
        // 내부적으로 저장 가능한 메모리 용량(Capacity)이 존재하며, 그 용량을 넘어 저장하려고 할 때 새로운 메모리를 할당받는다.

        // ArrayList 인스턴스 생성하기
        List<String> stringList = new ArrayList<String>();

        // ArrayList의 맨 마지막에 새로운 요소 넣기
        stringList.add("An adorable Aggie Koishi!");

        // ArrayList의 특정 인덱스 위치에 새로운 요소 넣기
        stringList.add(0, "Koishi is an adorable Aggie!");

        // 콜렉션의 모든 요소를 ArrayList에 추가하기
        List<String> anotherStringList = new ArrayList<String>();
        anotherStringList.add("Aggie Hoshino");
        anotherStringList.add("Hoshino is an adorable Aggie!");
        stringList.addAll(anotherStringList);

        // ArrayList 내 특정 요소가 있는지 확인하기
        System.out.println(stringList.contains("Aggie Koishi"));
        System.out.println(stringList.contains("Aggie Hoshino"));

        // ArrayList의 특정 인덱스에 있는 요소 확인하기
        System.out.println(stringList.get(1));

        // ArrayList 내 특정 요소가 어느 인덱스에 있는지 확인하기 (없을 경우 -1)
        System.out.println(stringList.indexOf("Aggie Hoshino"));
        System.out.println(stringList.indexOf("Aggie Koishi!"));

        // ArrayList가 비어있는지 확인하기
        System.out.println(stringList.isEmpty());

        // ArrayList의 현재 길이 확인하기
        System.out.println(stringList.size());

        // ArrayList의 모든 요소를 배열 형태로 받기
        System.out.println(Arrays.deepToString(stringList.toArray()));

        // ArrayList의 특정 인덱스에 있는 요소 지우기
        stringList.remove(2);

        // ArrayList 내 특정 첫번째 요소 지우기
        stringList.remove("An adorable Aggie Koishi!");

        System.out.println(Arrays.deepToString(stringList.toArray()));

        // ArrayList의 모든 요소 삭제하기
        stringList.clear();
    }
}
