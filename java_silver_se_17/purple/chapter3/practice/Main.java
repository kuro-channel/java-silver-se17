package purple.chapter3.practice;

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
    }
}
