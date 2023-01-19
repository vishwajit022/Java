package Strings;

public class palindrome {
    public static boolean ispalindrome(String name)

    {
        int n = name.length();
        for (int i = 0; i <= n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - 1 - i))

                return false;
        }
        return true;
    }

    public static void main(String[] a) {
        String name = "delta";
        System.out.println(ispalindrome(name));

    }

}
