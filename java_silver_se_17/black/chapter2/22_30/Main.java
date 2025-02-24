public class Main {
    public static void main(String[] args) {
        // chapter2-22
        // 先頭は改行が必要、末尾は改行が不要
        String str = """
                this is textblock sample.""";
        System.out.println(str);

        // chapter2-24
        // コンスタントプール
        final String a = "sample";
        final String b = "sample";

        // == は参照先のアドレスを比較する
        // equals は参照先の値を比較する
        // コンスタントプールは同じ値の場合、同じアドレスを参照する
        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true

        // chapter2-25
        final String c = new String("sample");
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true

        // chapter2-26
        // internメソッド: 文字列をコンスタントプールからさがして再利用する
        final String d = "abc";
        final String e = new String(d);

        int count = 0;

        if (d.intern() == "abc") {
            count++;
        }
        if (e.intern() == "abc") {
            count++;
        }
        if (d.intern() == e.intern()) {
            count++;
        }
        System.out.println(count); // 3

        // chapter2-28
        // 配列型変数の宣言
        int[] array1; // 一般的な宣言
        int array2[]; //
        int[][] array3; // 二次元配列
        int array4[][]; //
        int[] array5[]; //
        int[][] array6[]; //

        // chapter2-30
        // コンパイルエラーになる例
        // A: int a[] = new int[2][3]; 次元数が合わない
        // B: int[] b = new int[2.3]; 配列の要素数が整数でない
        // F: int f[][] = new int[][3]; 1次元目の要素数が指定されていない
    }
}
