class KoishiException extends Exception {
    public KoishiException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void test(int input) throws KoishiException {
        if (input == 514) {
            throw new KoishiException("Koishi is an adorable Aggie!");
        }
    }

    public static void main(String[] args) throws Exception {
        // Throwable의 하위 객체: Exception, Error
        // Exception의 하위 객체: RuntimeException, IOException, SQLException
        // Error의 하위 객체: StackOverflowError, OutOfMemoryError

        // 커스텀 예외를 만드는 방법
        // 예외 또한 클래스 중 하나이기 때문에, Exception 클래스를 상속하고 커스텀 예외 클래스를 만들어 throw를 하면 된다.

        try {
            CustomException.test(100);
            CustomException.test(514);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
