import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) throws Exception {
        // for문
        for (int i = 0; i < 10; i++) {
            System.out.println("기초적인 for문 출력");
        }

        // ArrayList 등등의 Iterable한 객체(배열이나 컬렉션)에 쓰일 수 있는 for문
        ArrayList<String> koishiArray = new ArrayList<String>();
        koishiArray.add("Aggie Koishi");
        koishiArray.add("Aggie Hoshino");
        for (String k: koishiArray) {
            System.out.println(k);
        }

        // while
        int whileI = 0;
        while (whileI < 10) {
            System.out.println("기초적인 while문 출력");
            whileI++;
        }

        // do-while
        // do-while문은 while문의 조건과 상관없이 딱 한 번 이상의 실행을 보장한다
        whileI = 0;
        do {
            System.out.println("do while문 출력");
            whileI++;
        } while (whileI < 0);

        // break
        // if의 조건에 해당될 경우 반복문을 빠져나간다
        for (int i = 1; i <= 10; i++) {
            System.out.println("break가 들어있는 for문");
            if (i % 5 == 0) {
                System.out.println("앗 5의 배수이다!");
                break;
            }
        }

        // continue
        // if의 조건에 해당될 경우 for문의 증감식으로 돌아가거나 while 실행문의 첫 부분으로 돌아간다
        for (int i = 1; i <= 10; i++) {
            System.out.println("continue가 들어있는 for문");
            if (i % 5 == 0) {
                System.out.println("앗 5의 배수이다!");
                continue;
            }
            System.out.println("continue가 들어있는 for문 끝");
        }
    }
}
