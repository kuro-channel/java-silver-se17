package purple.chapter3.practice_7;

public class Main {
    public static void main(String[] args) {
        // 7. switch文
        // String s = "A";
        String s = "E";
        switch (s) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C", "D":
                System.out.println("C, D");
                break;

            default:
                System.out.println("Other");
                break;
        }

        // defalutの位置を変えてみる
        // breakがないと、次のcaseに処理が移る
        String s1 = "A";
        switch (s1) {
            default:
                System.out.println("Other");
            case "A":
                System.out.println("A");
            case "B":
                System.out.println("B");
            case "C", "D":
                System.out.println("C, D");
        }

        // String n = null;
        // switch文の式にnullを指定すると、NullPointerExceptionが発生する
        // switch (n) {
        // case "A":
        // System.out.println("A");
        // break;
        // case "B":
        // System.out.println("B");
        // break;
        // case "C", "D":
        // System.out.println("C, D");
        // break;

        // default:
        // System.out.println("Other");
        // break;
        // }

        // -> を使用したswitch文
        String s2 = "ABC";
        switch (s2) {
            case "ABC" -> System.out.println("ABC");
            case "B" -> System.out.println("B");
            case "C", "D" -> System.out.println("C, D");
            default -> System.out.println("Other");
        }

        // switch式
        int month = 12;

        System.out.println(switch (month) {
            // yieldを使用して値を返す
            case 1, 2, 12:
                yield "Winter";
            case 3, 4, 5:
                yield "Spring";
            case 6, 7, 8:
                yield "Summer";
            case 9, 10, 11:
                yield "Autumn";
            default:
                yield "Unknown";
        });

        String val = switch (month) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Unknown";
        };
        System.out.println(val); // Winter
    }
}
