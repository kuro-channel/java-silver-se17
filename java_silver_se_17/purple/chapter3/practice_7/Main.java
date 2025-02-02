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


        
    }
}
