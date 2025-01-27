import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // chapter2-2
        // int e = 0827; コンパイルエラー

        // chapter2-3
        // _（アンダースコア）
        // 1. リテラルの先頭と末尾には使用できない
        // 2. 記号の前後には使用できない

        // int c = _123_456_789; 先頭につけちゃダメ
        // int d = 123_456_789_; 末尾につけちゃダメ
        int c = 123_456_789; // OK

        // float e = 3_.1415F; // 記号の前後につけちゃダメ
        // float e = 3.1_415F // NG 小数点以下の_はダメ
        // float e1 = 3.141_5F // NG
        float e2 = 31_415F; // OK

        // long f = 999_99_9999_L; // NG リテラルの前後には_はつけられない
        long f = 999_99_9999L; // OK

        // int i = 0X_52; NG

        // chapter2-4
        // 識別子に{}や.は使えない
        // int ${d} = 400; // NG
        // int g.a = 700; // NG

        // chapter2-5
        int[][] a = { { 1, 3 }, { 2, 4 } }; // 1次元目の要素: 0, 1 , 2次元目の要素: {1, 1}, {2, 2}
        System.out.println(a[0]); // ハッシュ値
        System.out.println(a[0][0]); // 1
        System.out.println(a[0][1]); // 3

        System.out.println(a[1]); // ハッシュ値
        System.out.println(a[1][0]); // 2
        System.out.println(a[1][1]); // 4

        short b = (short) 'A';
        System.out.println(b); // 65

        boolean d = (10 == 10);
        System.out.println(d); // true

        // float e = 1.99; // NG 精度が失われる可能性があるdoubleからfloatへの変換
        // 浮動小数点リテラルはデフォルトでdouble型

        int f2 = 12_34;
        System.out.println(f2); // 1234

        // String g = 'a'; // エラー: 不適合な型: charをStringに変換できません:

        // var a; // エラー: ローカル変数aの型を推論できません (初期化子なしで変数に'var'を使用することはできません)
        // var b = null; // エラー: ローカル変数の型は明示的に宣言する必要があります
        // var c = () -> {}; // エラー: ローカル変数の型は明示的に宣言する必要があります (ラムダ式には明示的なターゲット型が必要です)
        // var d = {1, 2, 3}; // エラー: ローカル変数の型は明示的に宣言する必要があります (配列初期化子には明示的なターゲット型が必要です)
        var e = new ArrayList<>();
    }
}
