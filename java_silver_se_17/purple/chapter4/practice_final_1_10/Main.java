package purple.chapter4.practice_final_1_10;

public class Main {
    public static void main(String[] args) {
        // 問題4-1
        // 10 9 8 7 6 5 4 3 2 1 0 と表示される
        int x = 10;
        while (x <= 10 && x >= 0) {
            System.out.print(x-- + " ");
        }

        // 問題4-2
        // A: 暗黙の型変換
        double d = 2.0;
        while (d < 10) {
            System.out.println(d++); // 暗黙の型変換が行われる、dはdouble型、10はint型、double型に変換される
        }

        // B:無限ループ
        // int i = 0;
        // while (i - 10 < i) {
        // System.out.println("*");
        // }

        // C: 到達不能コード、コンパイルエラー
        // Unreachable code
        // while (false) {
        // System.out.println("Hello");
        // }

        // D:
        int i = 3;
        while ((i > 0 ? i++ : i--) < 3) {
            System.out.println("*"); // ここには到達しない
        }

        // E
        String j = "j";
        do {
            System.out.println("*");
        } while (!("j".equals(j)));

        // 問題4-3
        int[] array = { 10, 20, 30, 40, 50, 60 };
        int count = array.length;
        while (count > 1) {
            count--;
            System.out.println(array[--count]);
        }
        // 50 30 10

        // 問題4-4
        int[] array2 = { 1, 2, 3, 4, 5 };

        // 全部表示するには
        i = 0;
        for (; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        for (int value : array2)
            System.out.print(value + " ");

        for (int value : array2) {
            System.out.print(value + " ");
            value++; // 直後に上書きされるため、意味がない
        }

        // 問題4-5
        // java Main 10 20 30
        int v = 0, w = 0;
        for (String s : args) {
            v += ++w + Integer.parseInt(s);
        }
        System.out.println(v); // 66

        // 問題4-6
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int a = 0, b = 1;
        for (a = chars.length - b; a > b; a -= 2) {
            System.out.print(chars[a] + " ");
        }

        // 問題4-8
        // while (1 == 2) { // 1 == 2 はfalseなので、ここには到達しない
        // System.out.println("Hello");
        // }
        i = 1;

        // while (i == 2) { // i == 2 はfalseなので、ここには到達しない
        // コンパイルエラーにはならない
        while (i == 2) {
            System.out.println("Hello");
        }

        // 問題4-9
        x = 10;
        while (x != 0) {
            System.out.println(x);
            x--;
        }
        // 10 9 8 7 6 5 4 3 2 1

        // 上記と同じ出力をさせたい
        x = 0;
        for (x = 10; !(x == 0); --x) {
            System.out.println(x);
        }
        // 10 9 8 7 6 5 4 3 2 1

        x = 10;
        for (; x > 0;) {
            System.out.println(x);
            x--;
        }
        // 10 9 8 7 6 5 4 3 2 1

        // 問題4-10
        for (int i3 = 0; i3 < 2;) {
            i++;
            int j1;
            for (j1 = 0; j1 < i3; j1++) {
            }
            System.out.println(j);
        }
        // System.out.println(i3); // コンパイルエラー
    }
}
