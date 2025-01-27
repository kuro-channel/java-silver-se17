import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // chapter2-41
        // removeメソッドは、指定した要素を削除する
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("A", 100));
        list.add(new Item("B", 200));
        list.add(new Item("C", 300));
        list.add(new Item("A", 100));
        list.remove(new Item("A", 500));

        for (Item item : list) {
            System.out.println(item.getName() + ":" + item.getPrice());
        }

        // chapter2-42
        // removeメソッドは、指定したインデックスの要素を削除する
        // かつ、後ろの要素を前に詰める
        ArrayList<Item> list2 = new ArrayList<>();
        list2.add(new Item("A", 100));
        list2.add(new Item("B", 200));
        list2.add(new Item("C", 300));

        System.out.println("chapter2-42:");

        // 拡張for文で要素を削除すると、カーソルがそのまま
        // A, B, C → A, C
        // Cは出力されない
        for (Item item : list2) {
            if (item.getName().equals("B")) {
                list2.remove(item);
            } else {
                System.out.println(item.getName() + ":" + item.getPrice());
            }
        }

        // chapter2-43
        // ConcurrentModificationExceptionを見てみる
        // 拡張for文で要素を削除すると、ConcurrentModificationExceptionが発生する
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");

        System.out.println("chapter2-43:");

        // for (String str : list3) {
        // if (str.equals("C")) {
        // list3.remove(str);
        // } else {
        // System.out.println(str);
        // }
        // }

        // java.util.ConcurrentModificationException
        // for (String str : list3) {
        // System.out.println(str);
        // }

        // chapter2-44
        // 固定長リストを作成する
        final var list4 = List.of("A", "B", "C");
        // list4.add("D"); // java.lang.UnsupportedOperationException
        System.out.println("chapter2-44:");
        for (String str : list4) {
            System.out.println(str);
        }

        final var list5 = Arrays.asList(new Integer[] { 1, 2, 3 });
        // list5.add(4); // java.lang.UnsupportedOperationException
        System.out.println("chapter2-44:");
        for (int i : list5) {
            System.out.println(i);
        }
    }

    static class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Item) {
                Item item = (Item) obj;
                if (name.equals(item.name)) {
                    return true;
                }
            }
            return false;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
