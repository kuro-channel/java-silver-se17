package purple.chapter2;
public class Main {
    public static void main(String[] args) {

        // Q2-5
        q2to5();

        // 配列の宣言
        int[] intArray1;
        int intArray2[];

        // 配列の宣言と初期化
        int[] intArray3 = new int[3];
        int[] intArray4 = {1, 2, 3};
        int[] intArray5 = {};
        // intArray5[0] = 1;
        // intArray5[1] = 2;
        // intArray5[2] = 3;

        int inrArray6[] = new int[] {1, 2, 3};
        
        // System.out.println(intArray1); 初期化してないのでコンパイルエラー
        // System.out.println(intArray2); 初期化してないのでコンパイルエラー
        System.out.println(intArray3);
        System.out.println(intArray4);
        System.out.println(intArray4[0]);
        System.out.println(intArray4[1]);
        System.out.println(intArray4[2]);
        System.out.println(intArray5);
        System.out.println(inrArray6);
    }

    public static void q2to5() {
        String text = "";

        // 表示パターン1
        text = """
                <html>
                    <body>
                        <p>"Hello, World!"</p>
                    </body>
                </html>
                """;

        System.out.println(text);

        // 表示パターン2
        // 各行の末尾にバックスラッシュを付ける
        text = """
                <html>\
                    <body>
                        <p>\"Hello, World!\"</p>\
                    </body>\
                </html>\
                """;
        System.out.println(text);

        // 表示パターン3
        System.out.println(
                """
                <html>
                    <body>
                        <p>"Hello, World!"</p>
                    </body>
                </html>
                """
        );
    }

    public static void q2to7(String[] args) {
        // var v1,v2;
        // var v3 = 1.23, var v4 = 1.23;
        final var v6 = "";
        // 要素数の指定はできない var v8 = new Int[3] {1, 2, 3}; 
        final var v8 = new int[] {1, 2, 3};
    }

    public static void q2to9(String[] args) {
        final String s;
        s = "Hello, World!";
        // s = "Hello, Java!"; 不変の値を書き換えようとしているのでコンパイルエラー
    }

}