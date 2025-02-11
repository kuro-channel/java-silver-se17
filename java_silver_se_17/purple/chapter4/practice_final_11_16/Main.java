package purple.chapter4.practice_final_11_16;

public class Main {
    public static void main(String[] args) {
        // 問題4-11
        int[][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[] { 1, 2 };
        for (int i = 0; i < 2; i++) {
            // array[0][1] = 1
            // array[0][2] = 2
            array[0][i] = i + 1;
        }
        for (int ar[] : array) {
            for (int a : ar) {
                System.out.print(a);
            }
            System.out.print("_"); // 120_12_
        }

        // 問題4-12
        char[] chars = new char[] { 'A', 'P', 'P', 'L', 'E' };
        int value = 0;
        for (char c : chars) {
            value += switch (c) {
                case 'A':
                    yield 1;
                case 'P':
                    yield 2;
                default:
                    yield 3;
            };
        }
        System.out.println();
        System.out.println(value); // 11

        // 問題4-13 要復習
        String text = "Hello";
        int index = 1;
        while (index < text.length()) {
            switch (text.charAt(index)) {
                case 'H':
                    System.out.print(0);
                case 'e':
                    System.out.print(1);
                    break; // switch文を抜ける
                case 'l':
                    System.out.print(2);
                    index++;
                    continue;
                case 'o':
                    System.out.print(3);
            }
            index++;
        }

        // 問題4-14
        String[][] letters = { { "A", "B", "C", "D" }, { "E", "F", "G", "H" } };

        System.out.println();

        for (String[] letter : letters) {
            for (String l : letter) {
                System.out.print(l);
            }
        }
        System.out.println();

        for (String[] letter : letters) {
            for (int i = 0; i < letter.length; i++) {
                System.out.print(letter[i]);
            }
        }

        // 問題4-15
        // スコープの問題
        String[] cities = { "Paris ", null, "Tokyo ", "Rio ", null };

        System.out.println();

        for (String city : cities) {
            int count = 0;
            if (city == null) {
                count++;
                continue;
            }
            System.out.print(city);
        }
        // System.out.println(count); // countはfor文の中でしか使えない

        // 問題4-16
        String[][] str = { { "A", "B", "C" }, { "D", "E", "F" } };

        System.out.println();

        outer: for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (i == 1)
                    break outer;
                if (j == 2)
                    continue outer;
                System.out.print(str[i][j]);
            }
        }
    }
}
