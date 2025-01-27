public class Main {
    public static void main(String[] args) {
        // chapter2-31
        // 配列とオブジェクト型
        Item[] items = new Item[3]; // null, null, null

        // 配列の宣言だけでは、各要素はnullのまま
        int total = 0;

        for (int i = 0; i < items.length; i++) {
            // nullの参照先を取得しようとすると、NullPointerExceptionが発生する、実行時エラー
            // total += items[i].getPrice(); // NullPointerException
            items[i] = new Item("item" + i, i * 100);
            total += items[i].getPrice();
        }
        System.out.println(total);

        // chapter2-32
        String[] array = { "A", "B", "C", "D" };
        array[0] = null;

        for (String string : array) {
            System.out.print(string);
        }

        // chapter2-33
        // コンパイルエラーにならないもの

        // A: {}を使うときは要素数を省略する
        // int[] a1 = new int[2] { 2, 3 }; // コンパイルエラー
        int[] a2 = new int[] { 2, 3 }; // OK

        // B:要素数0
        int b[][] = {};
        b = new int[2][3];

        b[0][0] = 1;
        b[0][1] = 2;
        b[0][2] = 3;
        b[1][0] = 4;
        b[1][1] = 5;
        b[1][2] = 6;

        System.out.println(b[0][0]);
        System.out.println(b[0][1]);
        System.out.println(b[0][2]);
        System.out.println(b[1][0]);
        System.out.println(b[1][1]);
        System.out.println(b[1][2]);

        // C: 多次元配列の宣言
        int[][] c = new int[][] {};
        c = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println(c[0][0]);
        System.out.println(c[0][1]);
        System.out.println(c[0][2]);
        System.out.println(c[1][0]);
        System.out.println(c[1][1]);
        System.out.println(c[1][2]);

        // D
        int[] d;
        d = new int[] { 1, 2, 3 };
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        // E
        int[] e;
        // e = { 1, 2, 3 }; // コンパイルエラー, new int[]を省略できない

        // chapter2-34
        final String[][] array2 = { { "A", "B" }, null, { "C", "D" } };
        int count = 0;
        for (String[] strings : array2) {
            // count += strings == null ? 1 : strings.length;
            // count += strings.length; 実行時にNullPointerExceptionが発生する
            if (strings != null) {
                count += strings.length;
            }
        }
        System.out.println("chapter2-34:" + count);
    }

    static class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
