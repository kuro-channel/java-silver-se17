public class Main {
    public static void main(String[] args) {
        // chapter2-7
        Sample sample = new Sample(10);
        sample.test();

        // chapter2-8
        // varにおける型推論はコンパイル時に行われる
        Chapter2To8A a = new Chapter2To8B(); // ポリモーフィズム
        // a = new Chapter2To8C(); // これはエラー、不適合な型: Chapter2To8CをChapter2To8Aに変換できません
        a.test(); // Chapter2To8Bのメソッドが呼ばれる

        Chapter2To8C c = new Chapter2To8C();
        c.test(); // Chapter2To8C独自のメソッドが呼ばれる

        // chapter2-10
        String str = "hoge, world.";
        hello(str); // 参照元の値はそのまま
        System.out.println(str); // hoge, world.
    }

    /**
     * chapter2-7: クラスのフィールドにvarは使えない
     */
    static class Sample {
        private int value;

        public Sample(int value) {
            this.value = value;
        }

        public void test() {
            System.out.println(value);
        }
    }

    /**
     * chapter2-8A
     */
    static class Chapter2To8A {
        public void test() {
            System.out.println("Chapter2To8A");
        }
    }

    /**
     * chapter2-8B
     */
    static class Chapter2To8B extends Chapter2To8A {
        @Override
        public void test() {
            System.out.println("Chapter2To8B");
        }
    }

    /**
     * chapter2-8C
     */
    static class Chapter2To8C {
        public void test() {
            System.out.println("Chapter2To8C");
        }
    }

    /**
     * chapter2-10：Stringオブジェクトは不変オブジェクト
     */
    private static void hello(String msg) {
        msg.replaceAll("hoge", "hello");
    }
}
