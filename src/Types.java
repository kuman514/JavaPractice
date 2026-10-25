import java.math.BigDecimal;

public class Types {
    public static void main(String[] args) throws Exception {
        // 정수 자료형: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
        byte koishiByte = 127;
        short koishiShort = 32_767;
        int koishiInt = 2_147_483_647;
        long koishiLong = 9_223_372_036_854_775_807L;

        // 실수 자료형: float(4바이트), double(8바이트)
        float koishiFloat = 5.14f;
        double koishiDouble = 5.14;
        double eExpression = 5.14e-1;

        // 정수나 실수 범위를 초과하는 수를 다루고 싶으면 BigDecimal 인스턴스를 생성해야 한다.
        BigDecimal koishiBigDecimal = new BigDecimal("514514514514514514514514514514514.514514514514514514514514514514514");
        BigDecimal koishiBigDecimal2 = new BigDecimal("514.514514514514514514514514514514514");
        BigDecimal result = koishiBigDecimal.subtract(koishiBigDecimal2);

        System.out.println(koishiByte);
        System.out.println(koishiShort);
        System.out.println(koishiInt);
        System.out.println(koishiLong);
        System.out.println(koishiFloat);
        System.out.println(koishiDouble);
        System.out.println(eExpression);
        System.out.println(result);

        // 불리언 자료형: boolean(1바이트)
        boolean isKoishiKoishi = 514 == 514;
        boolean isKoishiLargerThan2 = 514 > 2;
        boolean is5Odd = 5 % 2 == 1;
        boolean is32SameAs22 = "32".equals("22");

        System.out.println(isKoishiKoishi);
        System.out.println(isKoishiLargerThan2);
        System.out.println(is5Odd);
        System.out.println(is32SameAs22);

        // 단일 문자 자료형: char(2바이트)
        char koishiChar = 'k';
        char koishiCharAscii = 107;
        char koishiCharUnicode = '\u006b';

        System.out.println(koishiChar);
        System.out.println(koishiCharAscii);
        System.out.println(koishiCharUnicode);

        // 문자열 자료형: String
        // 단일 문자와 문자열을 엄격히 구분하기 때문에, 단일 문자는 '...', 문자열은 "..."로 표시해야 함.
        // String은 불변 객체(Immutable Object)로, 한 번 생성되면 읽기 전용이 되어 변경이 불가능해진다.
        // 즉, 만약 String에 + 연산 등등으로 문자열을 이어붙였다면, 기존 String이 변경되는 것이 아닌, 새로운 String 인스턴스가 생성되는 것이다.
        String koishiString = "Koishi is an adorable Aggie!";
        String anotherKoishiString = new String("Koishi is an adorable baby!");

        System.out.println(koishiString);
        System.out.println(anotherKoishiString);

        // Java의 원시 자료형(Primitive Types): byte, short, int, long, float, double, boolean, char
        // Java의 원시 자료형이 아닌 자료형은 모두 참조 자료형(Reference Types)이다.
        // Java의 참조 자료형은 객체이다.

        // 스택(Stack) 영역
        // 원시 자료형의 실제 값과 참조 자료형의 주소가 저장되는 곳.
        // 객체 내 메소드 종료 시, 메모리가 반환되어 비워진다.

        // 힙(Heap) 영역
        // 객체 등등 동적으로 할당된 자료들의 실제 값이 저장되는 곳.
        // 프로그램 실행 중에 동적으로 저장된다.
        // 원시 자료형과는 달리, 할당되는 크기가 정해져 있지 않다.
        // 할당된 객체를 참조하는 곳이 없을 때, Java의 가비지 컬렉터(Garbage Collector)가 할당을 회수한다.
        // (가비지 컬렉터: 힙에 할당되었는데 더이상 사용되지 않는 객체를 제거하는, Java의 특징 중 하나.)

        // 원시 자료형과 참조 자료형의 차이
        // 원시 자료형은 값 그 자체가 스택 영역에 저장되고, 참조 자료형은 값 그 자체(즉, 인스턴스)는 힙 영역에 저장되며 그 변수의 주소값이 스택 영역에 저장된다.
        // 원시 자료형은 null을 담을 수 없고, 참조 자료형은 null을 담을 수 있다.
        // 원시 자료형은 제네릭 타입으로 사용할 수 없고, 참조 자료형은 제네릭 타입으로 사용할 수 있다. (예: ArrayList<int>는 안 되지만, ArrayList<Integer>는 가능하다.)

        // Java의 모든 Class와 Enum은 Object 클래스를 상속한다.

        // 박싱(Boxing)은 원시 자료형을 참조 자료형으로 변환하는 작업이고, 언박싱(Unboxing)은 참조 자료형을 원시 자료형으로 변환하는 작업이다. (대표적으로, Wrapper 클래스가 있다.)
        // Wrapper 클래스는 원시 자료형을 감싼 클래스로, Byte, Short, Integer, Long, Float, Double, Boolean, Character 등등의 클래스가 있다.
        // Wrapper 클래스는 제네릭에 원시 자료형을 담기 위해 인스턴스 형태로 바꾸는 형태로 사용된다.

        // 참고
        // https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EA%B8%B0%EB%B3%B8-%EC%9E%90%EB%A3%8C%ED%98%95-%EC%A2%85%EB%A5%98-%EC%B4%9D%EC%A0%95%EB%A6%AC-int-double-char-String
        // https://snowwhite1106.tistory.com/73
        // https://velog.io/@afteryoon/%EC%9E%90%EB%A3%8C%ED%98%95%EA%B3%BC-%EC%98%A4%ED%86%A0%EB%B0%95%EC%8B%B1%EA%B3%BC-%EC%96%B8%EB%B0%95%EC%8B%B1-%EC%9E%90%EB%B0%94-%EA%B0%9C%EB%B0%9C%EC%9E%90%EA%B0%80-%EC%95%8C%EC%95%84%EC%95%BC-%ED%95%A0-%ED%95%84%EC%88%98-%EA%B0%9C%EB%85%90
    }
}
