package purple.chapter3.practice_final_11_20;

public class Main {
    public static void main(String[] args) {
        // 問題3-11
        var v = 10;
        if (v == 10.5) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        // 問題3-12
        int a = 1, b = 2, x = 5, y = 10;
        var v1 = 0;

        // |は論理和, ||は短絡論理和
        // |は左辺と右辺の両方を評価する, ||は左辺がtrueの場合右辺を評価しない
        if ((++a == b) | ((x *= 2) == y))
            v1 = x;
        else
            v = y;
        System.out.println("v:" + v1); // 10

        // 問題3-13
        int length = args.length;

        // = は代入演算子, == は比較演算子
        // if (length = 2) System.out.println("2 arguments");

        // 問題3-14
        String[] array = { "H", "E", "L", "L", "O" };
        String text = "";
        if (array[0] == "H")
            text += array[0];
        if (!(array[2] == "e")) {
            text += "e";
        } else if (array[4].equalsIgnoreCase("O")) {
            text += "o";
        } else {
            text += "!";
        }
        System.out.println(text); // He

        // 問題3-15
        var v2 = "Hello Java SE";
        var v3 = new StringBuilder("Hello Java SE");
        var v4 = v2.replace("Hello", "Hi");
        var v5 = v3.replace(0, 5, "Hi").toString();
        String s = "";
        if (v2 == v4) {
            if (v2 == v5) {
                s = "v2, v4, v5";
            }
        } else {
            if (v4.equals(v5))
                s = "v4, v5";
            s = "N/A";
        }

        System.out.println(s); // "N/A"

        // 問題3-16
        x = Integer.parseInt(args[0]);
        if (x < 100)
            System.out.println("A");
        else if (x <= 100 && x >= 50)
            System.out.println("B");
        else
            System.out.println("C");

        // > java Main 100 とした場合：Bと表示される
        // > java Main 101 とした場合：cと表示される

        // 問題3-18
        final char charA = 'a';
        char k = 'k';
        int val = 0;
        switch ("Black".charAt(3)) {
            case charA:
                val += 1;
                break;
            case charA + 2:
                val += 2;
                // case k: // CASEで指定できるのは定数のみ
                // val += 3;
                // break;
        }
        System.out.println(val); // 2

        // 問題3-19
        int i = 5;
        switch (i--) { // i--はiを評価した後にデクリメントされる
            case 4 -> i -= 2;
            case 3 -> {
                i *= 2;
            }
            default -> --i; // ここに来る、i = 4でさらにデクリメントされる
        }
        System.out.println(i); // 3

        // 問題3-20
        String country = "US FR JP".substring(3, 5);
        String currency = switch (country) {
            case "US":
                yield "USD";
            case "FR":
                yield "EUR";
            case "JP":
                yield "JPY";
            // かならずdefaultを書かないとコンパイルエラー
            // defaultを書く理由は、switch式が全てのケースを網羅しているかを確認するため
            default:
                yield "N/A";
        };
        System.out.println(currency); // EUR
    }
}
