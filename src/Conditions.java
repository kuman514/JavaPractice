public class Conditions {
    public static void main(String[] args) throws Exception {
        // if
        boolean isThisBool = true;
        if (isThisBool) {
            System.out.println("Yes, this is boolean.");
        }

        // if의 조건문에 int, char, String 등등 bool로 바꿀 수 없는 표현식은 들어갈 수 없다. (Type mismatch: cannot convert from ... to boolean)
        // char tryingOtherThanBool = '5';
        // if (tryingOtherThanBool) {
        // }

        // if-else
        boolean isElse = false;
        if (isElse) {
            System.out.println("Yes, this is else.");
        } else {
            System.out.println("No, this is boolean, not else.");
        }

        // switch-case
        int koishi = 514;
        switch (koishi) {
            case 514:
                System.out.println("Koishi is an adorable Aggie!");
                break;
            case 1024:
                System.out.println("1024!!");
                break;
            default:
                System.out.println("Default!!");
                break;
        }

        char koishiChar = 'a';
        switch (koishiChar) {
            case 'a':
                System.out.println("Koishi is an adorable Aggie!");
                break;
            case 1024:
                System.out.println("1024!!");
                break;
            default:
                System.out.println("Default!!");
                break;
        }

        String koishiString = new String("koishi komeiji");
        switch (koishiString) {
            case "koishi komeiji":
                System.out.println("Koishi is an adorable baby!");
                break;
            default:
                System.out.println("Default!!");
                break;
        }

        String koishiString2 = "koishi komeiji 514";
        switch (koishiString2) {
            case "koishi komeiji":
                System.out.println("Koishi is an adorable baby!");
                break;
            default:
                System.out.println("Default!!");
                break;
        }

        // Java의 switch-case 값에는 int로 변환될 수 있는 값이나, 문자열(string), 열거형(enum)만 담을 수 있다.
        // int로 변환될 수 있는 값은 char, short, int 등등이 있다. (long, boolean, float, double은 안 됨.)
        // (Only convertible int values, strings or enum variables are permitted)

        // boolean isKoishi = true;
        // switch (isKoishi) {
        //     case true:
        //         break;
        //     case false:
        //         break;
        //     default:
        //         break;
        // }

        // double koishiFloat = 5.14;
        // switch (koishiFloat) {
        //     case 514:
        //         System.out.println("Koishi is an adorable Aggie!");
        //         break;
        //     default:
        //         break;
        // }
    }
}
