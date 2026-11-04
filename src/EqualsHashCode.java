import java.util.Objects;
import java.util.HashSet;

class EqualsNotOverrideObejct {
    private String name;
    private String description;

    public EqualsNotOverrideObejct(String newName, String newDescription) {
        this.name = newName;
        this.description = newDescription;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}

class EqualsOverrideObejct {
    private String name;
    private String description;

    public EqualsOverrideObejct(String newName, String newDescription) {
        this.name = newName;
        this.description = newDescription;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EqualsOverrideObejct)) {
            return false;
        }

        EqualsOverrideObejct eobj = (EqualsOverrideObejct)obj;

        return Objects.equals(this.name, eobj.getName()) && Objects.equals(this.description, eobj.getDescription());
    }
}

class EqualsHashCodeOverrideObejct {
    private String name;
    private String description;

    public EqualsHashCodeOverrideObejct(String newName, String newDescription) {
        this.name = newName;
        this.description = newDescription;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EqualsHashCodeOverrideObejct)) {
            return false;
        }

        EqualsHashCodeOverrideObejct eobj = (EqualsHashCodeOverrideObejct)obj;

        return Objects.equals(this.name, eobj.getName()) && Objects.equals(this.description, eobj.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}

public class EqualsHashCode {
    public static void main(String args[]) throws Exception {
        EqualsNotOverrideObejct koishi1 = new EqualsNotOverrideObejct("Koishi", "Aggie");
        EqualsNotOverrideObejct koishi2 = new EqualsNotOverrideObejct("Koishi", "Aggie");

        // ==
        // 원시값이 서로 같은지 확인할 때 쓰이는 연산자이다.
        // 객체에 이 연산자를 사용하면, 객체의 주소값을 비교한다.
        System.out.println('c' == 'c');
        System.out.println(koishi1 == koishi2);


        // equals
        // 객체의 주소값이 아닌 실제 값을 기준으로 서로 같은지 확인할 때 쓰이는 메소드이다.
        // 보통 String에 가장 흔히 쓰이며, String.equals는 String 객체가 서로 같은 문자열을 가지고 있는지 확인하도록 구현되어 있다.
        // 그 외 객체의 equals는 오버라이딩 하지 않는 이상 ==와 같이 객체의 주소값을 비교한다.
        String koishi3 = "Aggie Koishi";
        String koishi4 = "Aggie Koishi";
        System.out.println(koishi3 == koishi4);
        System.out.println(koishi3.equals(koishi4));
        System.out.println(koishi1.equals(koishi2));

        EqualsOverrideObejct koishi5 = new EqualsOverrideObejct("Koishi", "Aggie");
        EqualsOverrideObejct koishi6 = new EqualsOverrideObejct("Koishi", "Aggie");
        System.out.println(koishi5 == koishi6);
        System.out.println(koishi5.equals(koishi6));

        // hashCode
        // 객체의 주소값을 기반으로 해시 과정을 거쳐 해시값을 만들어내는 메소드이다. (즉, 주소값으로 만든 고유한 숫자)
        // 기본적으로, Object 클래스의 native한 메소드이다. (public native int hashCode)

        // equals를 오버라이딩했다면 hashCode도 함께 오버라이딩해줘야 한다.
        // 왜냐하면, equals에서 true로 판명된 두 객체는 서로 해시값도 같아야 한다는 Java의 법칙 때문이다.
        // 해시 값을 사용하는 HashSet, HashMap, HashTable 등등의 Collection Framework를 사용할 때 문제가 발생할 수 있다.

        // 중복을 허용하지 않으니 분명 1이어야 할 size가 2로 나온다.
        HashSet<EqualsOverrideObejct> testSet = new HashSet<EqualsOverrideObejct>();
        testSet.add(new EqualsOverrideObejct("Hoshino Takanashi", "An adorable Aggie"));
        System.out.println(testSet.size());
        testSet.add(new EqualsOverrideObejct("Hoshino Takanashi", "An adorable Aggie"));
        System.out.println(testSet.size());

        // hashCode를 올바르게 오버라이딩하면 중복을 허용하지 않는 Set에서 두 번 넣어도 size가 1로 나오게 한다.
        HashSet<EqualsHashCodeOverrideObejct> testSet2 = new HashSet<EqualsHashCodeOverrideObejct>();
        testSet2.add(new EqualsHashCodeOverrideObejct("Hoshino Takanashi", "An adorable Aggie"));
        System.out.println(testSet2.size());
        testSet2.add(new EqualsHashCodeOverrideObejct("Hoshino Takanashi", "An adorable Aggie"));
        System.out.println(testSet2.size());

        // 참고: https://inpa.tistory.com/entry/JAVA-%E2%98%95-equals-hashCode-%EB%A9%94%EC%84%9C%EB%93%9C-%EA%B0%9C%EB%85%90-%ED%99%9C%EC%9A%A9-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0
    }
}
