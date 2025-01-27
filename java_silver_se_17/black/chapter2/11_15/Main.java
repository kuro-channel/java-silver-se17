public class Main {
    public static void main(String[] args) {
        // chapter2-11
        String str = "abcde";
        System.out.println(str.charAt(4)); // e
        // System.out.println(str.charAt(5)); // StringIndexOutOfBoundsException

        // chapter2-12
        // indexOfメソッドは指定された文字列がどの位置にあるかを返す
        System.out.println(str.indexOf("abcdef")); // -1
        System.out.println(str.indexOf("bc")); // 1
        System.out.println(str.indexOf("cd")); // 2

        // chapter2-13
        System.out.println(str.substring(2, 4)); // cd

        // chapter2-14
        String str2 = "aaaa";
        System.out.println(str2.replaceAll("aa", "b")); // bb

        String str3 = "aaaa";
        System.out.println(str3.replace("aa", "b")); // bb

        // chapter2-15
        // "abcde" = 5
        // System.out.println(str.charAt(str.length())); //
        // 実行時エラー：StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length() - 1)); // e
    }
}
