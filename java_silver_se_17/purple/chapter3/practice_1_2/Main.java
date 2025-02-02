package purple.chapter3.practice_1_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 算術演算子
        int a = 10, b = 3;
        System.out.println(a + b); // 13
        System.out.println("a + B:" + a + b); // a + B:103
        System.out.println(a * b); // 30
        System.out.println(a - b); // 7
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

        // インクリメント・デクリメント演算子
        int i = 10, j = 10, x, y;
        i++;
        j++;
        System.out.println("i:" + i + ", j:" + j); // i:11, j:11

        i = 10;
        j = 10;
        x = ++i;
        y = --j;
        System.out.println("i:" + i + ", j:" + j); // i:11, j:9
        System.out.println("x:" + x + ", y:" + y); // x:11, y:9

        // 後置の場合、代入後にインクリメント・デクリメントされる
        i = 10;
        j = 10;
        x = i++;
        y = j--;
        System.out.println("i:" + i + ", j:" + j); // i:11, j:9
        System.out.println("x:" + x + ", y:" + y); // x:10, y:10

        int a1 = 1, b1 = 1, c = 1, d = 1;

        System.out.println(a1++); // 1
        System.out.println(++b1); // 2
        System.out.println(c--); // 1
        System.out.println(--d); // 0

        // 後置のa1++とc--は、代入後にインクリメント・デクリメントされる
        System.out.println("a1:" + a1 + ", b1:" + b1 + ", c:" + c + ", d:" + d); // a1:2, b1:2, c:0, d:0

        // 代入演算子
        // 複合代入演算子
        int a2 = 1, b2 = 2, c2 = 3, d2 = 10, e2 = 10;
        int x2 = 3;
        System.out.println("a2 += x : " + (a2 += x2)); // a = a + x;
        System.out.println("b2 -= x : " + (b2 -= x2)); // a = b - x;
        System.out.println("c2 *= x : " + (c2 *= x2)); // a = c * x;
        System.out.println("d2 /= x : " + (d2 /= x2)); // a = d / x;
        System.out.println("e2 %= x : " + (e2 %= x2)); // a = e % x;

        System.out.println();

        // 関係演算子
        int y3 = 10, z3 = 10;
        System.out.println("x3 == y3 : " + (y3 == z3)); // true
        System.out.println("x3 != y3 : " + (y3 != z3)); // false
        System.out.println("x3 > y3  : " + (y3 > z3)); // false
        System.out.println("x3 >= y3 : " + (y3 >= z3)); // true
        System.out.println("x3 < y3  : " + (y3 < z3)); // false
        System.out.println("x3 <= y3 : " + (y3 <= z3)); // true

        // 代入演算子と複合代入演算子
        int total = 0, price = 100, count = 0;
        total += price; // total = total + price;
        count += 2; // count = count + 2;
        System.out.println(total);
        System.out.println(count);

        // 関係演算子
        int y1 = 10;
        int z1 = 10;
        boolean b3 = (y1 == z1); // true
        boolean b4 = (y1 > z1); // false
        System.out.println(b3);
        System.out.println(b4);

        // 論理演算子の&と&&
        int i1 = 0;
        int j1 = 10;
        boolean b5, b6;
        b5 = (i1 < 0) & ((j1++) <= 10); // &:両方評価する

        System.out.println("b5:" + b5 + " j1:" + j1);

        j1 = 10;
        b6 = (i1 < 0) && ((j1++) <= 10); // &&:最初のオペランドがtrueでなければ後続を評価しない
        System.out.println("b6:" + b6 + " j1:" + j1);

        j1 = 10;
        b5 = (i1 < 0) | ((j1++) <= 10); // |:両方評価する

        System.out.println("b5:" + b5 + " j1:" + j1);

        j1 = 10;
        b6 = (i1 < 0) || ((j1++) <= 10); // ||:最初のオペランドがtrueでなければ後続を評価しない
        System.out.println("b6:" + b6 + " j1:" + j1);

        // 三項演算子
        int num1 = 11;
        int num2 = 12;
        String result1 = num1 % 2 == 0 ? "even" : "odd";
        System.out.println(result1);

        int val1 = num1 > 11 ? num1 = 0 : ++num1;
        System.out.println(val1);

        int val3 = num1 > 11 ? num1 = 0 : num1++;
        System.out.println(num1);
        System.out.println(val3);

        String result2 = num2 % 2 == 0 ? "even" : "odd";
        int val2 = num2 > 11 ? num2 = 0 : ++num2;
        System.out.println(result2);
        System.out.println(val2);
        System.out.println(num2);

        // 2.データ型
        short s = 10;
        int i2 = 10;
        float f = 10.0F;
        double d1 = 10.0;
        char a3 = 'a';

        String s1 = "Duke";
        String s2 = new String("Duke");

        // s1 = s2
        System.out.println("s == i2:" + (s == i2)); // true
        System.out.println("f == d1:" + (f == d1)); // true
        System.out.println("a3 != 'A':" + (a3 != 'A')); // true
        System.out.println("s1 == s2:" + (s1 == s2)); // false
        System.out.println("s1.equals(s2):" + s1.equals(s2)); // true

        // コンスタントプール
        String s3 = "Java";
        String s4 = new String("Java");
        String s5 = "Java";
        String s6 = s4.intern();
        String t1 = """
                Java""";
        String t2 = """
                Java
                """;

        System.out.println("equals():" + s3.equals(s4)); // true
        System.out.println("s3 == s4:" + (s3 == s4)); // false newで生成されたオブジェクトは異なる
        System.out.println("s3 == s5:" + (s3 == s5)); // true
        System.out.println("s3 == s6:" + (s3 == s6)); // true intern()でコンスタントプールに登録される
        System.out.println("s3 == t1:" + (s3 == t1)); // true 改行が含まれないと同じ
        System.out.println("s3 == t2:" + (s3 == t2)); // false 改行が含まれると異なる

        // StringBuilder
        // StringBuilderは文字列を比較するequalsメソッドを持っていない
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        // StringBuilderはequalsメソッドを持っていない
        // java.object.equals()が呼ばれる
        // Object.equals()は==と同じ, インスタンスが同じかどうかを比較する
        System.out.println("sb1.equals(sb2):" + sb1.equals(sb2)); // false
        String s7 = sb1.toString();
        String s8 = sb2.toString();
        System.out.println("s7.equals(s8):" + s7.equals(s8)); // true
    }
}
