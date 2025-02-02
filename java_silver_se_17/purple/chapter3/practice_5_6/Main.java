package purple.chapter3.practice_5_6;

public class Main {
    public static void main(String[] args) {
        // 論理演算子の例
        int a = 5, b = 10;
        if (a <= 10 && b <= 10) {
            System.out.println("a <= 10 && b <= 10");
        }
        // charの比較例
        char c = 'c';
        if (c == 'c') {
            System.out.println('c');
        }
        // Stringの比較例
        String s = new String("Java");
        if ("Java".equals(s)) {
            System.out.println("\"Java\".equals(s)");
        }
    }
}
