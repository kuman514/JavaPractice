import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Koishi implements Comparable<Koishi> {
    public int id;
    public String name;

    public Koishi(int newId, String newName) {
        this.id = newId;
        this.name = newName;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Koishi koishi) {
        if (this.id < koishi.id) {
            return -1;
        } else if (this.id > koishi.id) {
            return 1;
        }
        return 0;
    }
}

public class ArrayTypes {
    public static void main(String[] args) throws Exception {
        // 배열 자료형 (자료형[])
        // Java의 배열은 선언할 때 자료형과 개수를 미리 정해놓아야 한다.
        int[] normalArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(normalArray[i]);
        }
        int[] normalArray2 = {514, 1, 2, 3, 4, 7};
        for (int i = 0; i < 6; i++) {
            System.out.println(normalArray2[i]);
        }

        // 배열 인쇄
        // Arrays.toString을 사용하지 않으면, 배열의 주소값이 나온다.
        System.out.println(Arrays.toString(normalArray));
        System.out.println(Arrays.toString(normalArray2));

        // 직접 배열 복사
        int[] copiedArray = new int[6];
        for (int i = 0; i < 6; i++) {
            copiedArray[i] = normalArray2[i];
        }
        System.out.println(Arrays.toString(copiedArray));

        // System.arraycopy를 사용한 배열 복사
        // 직접 배열을 복사하는 방식보다 System.arraycopy나 Arrays.copyOf를 사용하는 것이 더 빠르다고 한다.
        int[] copiedArray2 = new int[6];
        System.arraycopy(normalArray2, 0, copiedArray2, 0, normalArray2.length);
        System.out.println(Arrays.toString(copiedArray2));

        // Arrays.copyOf를 사용한 배열 복사
        int[] copiedArray3 = Arrays.copyOf(normalArray2, normalArray2.length);
        System.out.println(Arrays.toString(copiedArray3));

        // 배열 정렬 (오름차순)
        // 베열을 정렬한다는 것은 정렬된 복사본을 반환하는 것이 아닌, 본래 있는 배열을 변형시키는 것이다.
        Arrays.sort(normalArray2);
        System.out.println(Arrays.toString(normalArray2));

        // 배열 정렬 (내림차순)
        // 내림차순 배열 정렬에 필요한 Collections.reverseOrder는 int같은 원시 타입을 지원하지 않아 반드시 Integer같은 객체 타입으로 해야 한다.
        Integer[] testArray = { 34,56,123,3,78 };
        Arrays.sort(testArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(testArray));

        // 배열 비교 (동일 여부)
        System.out.println(Arrays.equals(copiedArray2, copiedArray3));

        // 2차원 배열
        int[][] multiDimensionArray = {
            { 5, 14, 2, 10, 19 },
            { 1, 2, 6, 7, 5 },
            { 31, 45, 56, 8, 9 },
        };

        // 3차원 배열
        int[][][] multiDimensionArray2 = {
            {
                { 5, 14, 2, 10, 19 },
                { 1, 2, 6, 7, 5 },
                { 31, 45, 56, 8, 9 },
            },
            {
                { 5, 14, 2, 10, 19 },
                { 1, 2, 6, 7, 5 },
                { 31, 45, 56, 8, 9 },
            },
            {
                { 5, 14, 2, 10, 19 },
                { 1, 2, 6, 7, 5 },
                { 31, 45, 56, 8, 9 },
            },
        };

        // n차원 배열은 각 원소가 (n-1)차원 배열의 주소값을 가지는 형태이다.
        // 그래서 n차원 배열을 Arrays.toString으로 출력하면 주소값 배열이 출력될 것이다.
        // n차원 배열의 내용을 의도대로 출력하려면, Arrays.deepToString을 사용하는 것이 좋다.
        System.out.println(Arrays.toString(multiDimensionArray));
        System.out.println(Arrays.deepToString(multiDimensionArray));
        System.out.println(Arrays.toString(multiDimensionArray2));
        System.out.println(Arrays.deepToString(multiDimensionArray2));

        // n차원 배열 내용 동일 비교를 하려고 할 때에도 마찬가지로, Arrays.deepEquals를 사용하는 것이 좋다.
        System.out.println(Arrays.deepEquals(multiDimensionArray, multiDimensionArray2[0]));
        System.out.println(Arrays.deepEquals(multiDimensionArray, multiDimensionArray2));

        // 가변 배열
        // n차원 배열의 각 원소의 배열 길이가 일정하지 않아도 된다.
        int[][] multiDimensionArray3 = {
            { 514, 2, 10 },
            { 1, 2, 6, 7, 5 },
            { 31, 56, 8, 9 },
        };
        System.out.println(Arrays.deepToString(multiDimensionArray3));

        // 객체 배열
        Koishi[] objectArray = {
            new Koishi(514, "Koishi Komeiji"),
            new Koishi(123, "Aggie Koishi"),
            new Koishi(102, "Hoshino Takanashi"),
            new Koishi(320, "Aggie Hoshino"),
        };

        // 원소가 객체로 된 배열을 복사할 때 System.arraycopy나 Arrays.copyOf를 사용하게 되면 주소값을 복사하게 된다. (얕은 복사)
        Koishi[] refCopiedObjectArray = Arrays.copyOf(objectArray, objectArray.length);
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(refCopiedObjectArray));

        // 따라서 깊은 복사를 하려면 for문 등등으로 직접 새로운 객체를 만들며 복사를 진행하는 수밖에 없다.
        // 깊은 복사를 진행한 배열의 각 원소의 주소가 다르게 나온 것을 알 수 있다.
        Koishi[] deepCopiedObjectArray = new Koishi[4];
        for (int i = 0; i < objectArray.length; i++) {
            deepCopiedObjectArray[i] = new Koishi(objectArray[i].id, objectArray[i].name);
        }
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(deepCopiedObjectArray));

        // 객체 배열 정렬에는 Comparable<T> 인터페이스를 구현하는 방법과 Comparator<T> 인터페이스를 구현하는 방법이 있다.
        // Comparable<T> 인터페이스를 구현하는 방식의 객체 배열 정렬
        for (Koishi k: deepCopiedObjectArray) {
            System.out.println(k.id + ", " + k.name);
        }
        Arrays.sort(deepCopiedObjectArray);
        for (Koishi k: deepCopiedObjectArray) {
            System.out.println(k.id + ", " + k.name);
        }
        // Comparator<T> 인터페이스를 구현하는 방식의 객체 배열 정렬
        Arrays.sort(deepCopiedObjectArray, new Comparator<Koishi>() {
            @Override
            public int compare(Koishi lhs, Koishi rhs) {
                return lhs.name.compareTo(rhs.name);
            }
        });
        for (Koishi k: deepCopiedObjectArray) {
            System.out.println(k.id + ", " + k.name);
        }
        // Comparator<T> 인터페이스를 구현하는 방식은 Java 8 람다식으로 요약이 가능하다.
        Arrays.sort(deepCopiedObjectArray, (lhs, rhs) -> Integer.compare(lhs.id, rhs.id));
        for (Koishi k: deepCopiedObjectArray) {
            System.out.println(k.id + ", " + k.name);
        }

        // 객체에 여러 조건으로 비교해야 할 때, Comparator.comparing이나 Comparator.thenComparing을 사용하여 정렬할 수도 있다.
        // 이 경우, 객체 속성을 가져오기 위해 getter 메소드와 setter 메소드가 필요하다.
        // (예: Comparator.comparing(SomeObject::getSomething).thenComparing(SomeObject::getAnother) 이런 방식으로 사용됨)
        Koishi[] objectArray2 = {
            new Koishi(514, "Koishi Komeiji"),
            new Koishi(514, "Aggie Koishi"),
            new Koishi(102, "Hoshino Takanashi"),
            new Koishi(320, "Aggie Hoshino"),
        };
        Arrays.sort(objectArray2, Comparator.comparing(Koishi::getId).thenComparing(Koishi::getName));
        for (Koishi k: objectArray2) {
            System.out.println(k.id + ", " + k.name);
        }
    }
}
