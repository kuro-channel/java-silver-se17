package purple.chapter3.practice_3_4;

public class Main {
    public static void main(String[] args) {
        // 3. 基本データ型の型変換
        float f = 10;
        System.out.println(f); // 10.0

        double d = 10 + f; // 10 + 10.0 = 20.0
        System.out.println(d); // 20.0

        // float f2 = 1.23; // コンパイルエラー
        // float f2 = 1.23f; // 1.23f とするか、キャストする
        float f2 = (float) 1.23;
        System.out.println(f2); // 1.23

        // int i = 10.1; // コンパイルエラー
        // int i = (int) 10.1; // キャストする
        // int i = (int) 10.6;
        int i = (int) 10.9;
        System.out.println(i); // 10

        boolean b = 10 < (int) 10.1; // 10 < 10 = false
        System.out.println(b); // false

        // byte b1 = 128; // コンパイルエラー
        // int から byte にキャストする, byte の範囲は -128 ～ 127
        byte b1 = (byte) 128; // -128
        System.out.println(b1); // -128

        int val = (int) (123 * 0.2);
        System.out.println(val); // 24

        // char型の型変換
        byte b2 = 97;
        short s = 98;
        int i1 = 99;
        long l = 100L;
        float f3 = 101.123f;
        double d1 = 102.456;

        // char型に変換
        char c = (char) b2;
        char c2 = (char) s;
        char c3 = (char) i1;
        char c4 = (char) l;
        char c5 = (char) f3;
        char c6 = (char) d1;

        System.out.println(c); // a
        System.out.println(c2); // b
        System.out.println(c3); // c
        System.out.println(c4); // d 100はASCIIコードのd
        System.out.println(c5); // e
        System.out.println(c6); // f

        // char型から数値に変換
        char g = 'g';
        char h = 'h';
        char i2 = 'i';

        byte charb = (byte) g;
        short chars = (short) h;
        int chari = (int) i2;

        System.out.println(charb); // 103
        System.out.println(chars); // 104
        System.out.println(chari); // 105

        byte b3 = 1;
        byte b4 = ++b3;
        System.out.println(b4); // 2

        Short s1 = 1;
        Short s2 = 2;

        // Short s3 = s1 + s2; // コンパイルエラー
        // int に変換して計算される
        Short s3 = (short) (s1 + s2);
        System.out.println(s3); // 3

        // 基本データ型とラッパークラスの変換
        Integer obj1 = 100; // プリミティブ型からラッパークラスへの変換: オートボクシング
        int i3 = obj1; // ラッパークラスからプリミティブ型への変換: アンボクシング
        System.out.println(i3); // 100

        // 文字列の変換
        int i4 = Integer.parseInt("123");
        double d2 = Double.parseDouble("123.456");
        boolean b5 = Boolean.parseBoolean("true");
        char c7 = "abc".charAt(1);

        System.out.println(i4); // 123
        System.out.println(d2); // 123.456
        System.out.println(b5); // true
        System.out.println(c7); // b
    }
}
