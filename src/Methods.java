class ExampleClass {
    private int id;
    private String title;

    public ExampleClass(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
}

public class Methods {
    public static void main(String[] args) throws Exception {
        // 메소드란, 클래스의 기능으로서 실행할 수 있는, 클래스의 멤버로 속해있는 함수이다.

        // 메소드의 목적은 다음과 같다.
        // - 코드 중복을 피한다.
        // - 코드의 가독성을 높인다.
        // - 유지보수를 쉽게 할 수 있다.
        // 이 때, 하나의 메소드에는 한 가지 기능만 수행할 수 있도록 만들자.

        // 메소드 정의 방법
        /**
         * 접근제어자 반환타입 메소드명(매개변수목록) { // 선언부
         *     ...; // 구현부
         * }
         */

        // Java 클래스 멤버의 접근제어자
        // private: 본 클래스 내에서만 접근이 가능하다
        // protected: 같은 패키지 내 또는 상속 관계에 있는 클래스에서도 접근이 가능하다
        // public: 클래스 외부에서까지 접근이 가능하다
        // default: 같은 패키지 내에 있는 클래스에서까지 접근이 가능하다

        // 반환 타입 없이 실행만 할 경우, 반환타입은 void이다
        // 반환 타입이 있을 경우, 구현부 내 return문으로 받는 값의 타입과 일치해야 한다

        // public static void main(String[] args)는 메인 메소드라고 불리며, Java로 프로그래밍을 할 때 엔트리 포인트로써 꼭 필요한 메소드이다.

        // 메소드 실행 예시
        // 먼저 메소드에 해당하는 클래스의 인스턴스를 할당 후, 그 인스턴스의 메소드를 호출한다.
        ExampleClass methodCalls = new ExampleClass(123, "Aggie Koishi");
        methodCalls.setId(514);
        System.out.println(methodCalls.getId() + ": " + methodCalls.getTitle());
    }
}