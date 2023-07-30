class Main {
    protected static String reverseString(String str) {
        final int size = str.length();
        String rev = "";

        for (int i = 0; i < size; i++)
            rev = rev.concat(str.charAt(size-i-1) + "");

        return rev;
    }

    public static void main(String[] args) {
        String str = "hello";
        String rev = reverseString(str);

        System.out.println(rev);
    }
}