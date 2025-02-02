package purple.chapter3.practice_final_1_10;

public class Main {
    public static void main(String[] args) {
        // 問題3-1
        // short a = 11.2; // コンパイルエラー, shortにdoubleを代入している
        byte b = 100;
        int c = 'c';
        double d = 3.5f; // ダウンキャスト
        // long e = 13.0; // コンパイルエラー, longにdoubleを代入している
        float f = 200L; // ダウンキャスト, floatにlongを代入している

        // 問題3-2
        int a = 10;
        double d1 = 2.0;
        var v = 2 + a / d1 * 5;
        System.out.println(v); // 27

        // 問題3-3
        int x = 5, y = 1;
        System.out.println(++x + x++ + y++ + ++y);
        // 6 + 6 + 1 + 3 = 16, 理由: ++x = 6, x++ = 6, y++ = 1, ++y = 3
        // なぜなら、++xはxに1を加算してからxを返す, x++はxを返してからxに1を加算する

        // 問題3-4
        byte data = 10;
        int[] array = { data, (int) 10.5 };
        System.out.println(array[0] < array[1]); // false

        // 問題3-5
        System.out.println(" value:" + 10 + 5); // value:105
        // なぜなら、文字列と数値の+演算子は文字列に変換される
        // System.out.println(" value:" + 10 * 2 - 5); // コンパイルエラー
        // 直すなら、()で囲む
        System.out.println(" value:" + (10 * 2 - 5)); // value:15
        System.out.println(" value:" + 5 + 10 * 2); // value:510

        // 問題3-6
        a = 10;
        b = 10;
        x = 0;
        y = 0;

        x = ++a; // 11
        y = b--; // 10
        int val = y < --x ? x++ : ++y; // 10 < 10 ? 11 : 11
        System.out.println("val:" + val); // 11

        // 問題3-8
        String j = "J";
        String s1 = "Java";
        String s2 = j + "ava";
        String s3 = "Ja" + "va";
        String s4 = new String("Java");
        String s5 = new String("Java");

        System.out.println(s1 == s2); // false, s2は新しいインスタンス, 変数jと文字列リテラルの結合で新しいインスタンスが生成される
        System.out.println(s1 == s3); // true, s3はコンパイル時に定数として扱われる
        System.out.println(s4 == s5); // false, s4とs5は別のインスタンス
        System.out.println(s4.equals(s5)); // true, equalsメソッドは文字列の内容を比較する
        System.out.println(s1 == s2.intern()); // true, internメソッドは文字列をプールから取得する

        // 問題3-9
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java");
        sb1.append("Java");
        System.out.print(sb1.toString()); // Java
        s1 = "Java";
        s2 = sb2.toString();
        System.out.println(sb1 == sb2); // false, インスタンスが異なる
        System.out.println(sb1.equals(sb2)); // false, equalsメソッドを持っていない
        System.out.println(s1 == s2); // false, インスタンスが異なる
        System.out.println(s1.equals(s2)); // true, equalsメソッドは文字列の内容を比較する
        System.out.println(s1.equals(sb1)); // false, equalsメソッドを持っていない

        // 問題3-10
        Integer v1 = 100;
        // double v2 = Double.parseDouble(1.23); // コンパイルエラー, 引数はString型
        long v3 = Long.parseLong("300");
        char v4 = "400".charAt(0);
        boolean v5 = Boolean.parseBoolean("true");

        System.out.println(v1); // 100
        System.out.println(v3); // 300
        System.out.println(v4); // 4
        System.out.println(v5); // true
    }
}
