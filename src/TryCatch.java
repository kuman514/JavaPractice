public class TryCatch {
    public static void main(String[] args) throws Exception {
        // 다른 언어들과 같이, 예외 상황에 대한 대처가 필요할 때 try-catch 구문을 사용한다.
        try {
            // 예외가 발생할 수 있는 실행문을 try문 내에 넣는다.

            // ArithmeticException 발생 구문
            int testInt = 3 / 0;

            // NullPointerException 발생 구문
            String testString = null;
            System.out.println(testString.toLowerCase());

            // IndexOutOfBoundException 발생 구문
            String[] yasuo = {};
            yasuo[2] = "Aggie Koishi";
        } catch (ArithmeticException ae) {
            // 특정한 타입의 예외를 처리할 수 있다.
        } catch (NullPointerException | IndexOutOfBoundsException ne) {
            // 여러 catch문 또는 | 연산자를 통해 여러 타입의 예외도 처리가 가능하다.
        } catch (Throwable e) {
            // 다형성을 활용하여, 예외 발생 시 throw된 객체를 catch함으로써 더욱 더 넓은 타입의 에러에 대응할 수 있다.
            // catch할 수 있는 객체는 Thworable 클래스 또는 이를 상속한 클래스이다.
            System.err.println(e.toString());
            // throw된 예외를 catch하지 않으면 앱이 종료된다.

            // 에러 메시지를 출력하려면 getMessage를 사용한다.
            System.err.println(e.getMessage());

            // 자세한 에러 메시지를 출력하려면 printStackTrace를 사용한다.
            e.printStackTrace();
        } finally {
            // try문 내 예외 발생 여부와 상관없이 실행할 로직을 넣는다.
            // 심지어 return문이 있어도 반드시 실행된다.
        }
    }
}