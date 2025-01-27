import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // chapter2-35
        // 配列の継承
        A31[] a = { new C31(), null, new D31() };
        Object[] b = a;
        System.out.println(b[0]); // C31@1b6d3586
        System.out.println(b[1]); // null
        System.out.println(b[2]); // D31@4554617c

        // chapter2-36
        int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };

        // cloneメソッドは、配列の要素をコピーする
        int[][] arrayB = arrayA.clone();
        int total = 0;
        for (int[] array : arrayB) {
            for (int i : array) {
                total += i;
            }
        }
        System.out.println("chapter2-36:" + total); // 12

        // chapter2-38
        // ジェネリクス
        // ジェネリクスを使わないと、Object型で扱われる
        ArrayList list = new ArrayList<>();
        list.add("A");
        list.add(10);
        list.add('B');
        for (Object obj : list) {
            System.out.println(obj);
        }

        // ジェネリクスを使うと、指定した型で扱える
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        // list2.add(10); // コンパイルエラー
        list2.add("B");
        for (String str : list2) {
            System.out.println(str);
        }

        // chapter2-39
        // addメソッドは、指定したインデックスに要素を追加する
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("A");
        // java.lang.IndexOutOfBoundsException: Index: 2, Size: 1
        // 例外が発生する
        // list3.add(2, "B"); // 2番目に追加
        list3.add("C");
        list3.add("D");

        System.out.println("chapter2-39:");
        for (String str : list3) {
            System.out.println(str);
        }

        // chapter2-40
        // setメソッドは、指定したインデックスの要素を置き換える
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.set(0, "B");
        list4.add("C");
        list4.set(1, "D");

        System.out.println("chapter2-40:");
        for (String str : list4) {
            System.out.print(str);
        }
    }

    static interface A31 {
    }

    static abstract class B31 implements A31 {
    }

    static class C31 extends B31 {
    }

    static class D31 extends C31 {
    }
}
