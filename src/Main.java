class Main {
    protected static String reverseString(String str) {
        final int size = str.length();
        String rev = "";

        for (int i = 0; i < size; i++)
            rev = rev.concat(str.charAt(size-i-1) + "");

        return rev;
    }

    protected static int[] reverseArray(int[] arr) {
        final int size = arr.length;
        int i, temp;

        for (i = 0; i < size / 2; i++) {
            temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");
    }

    public static void main(String[] args) {
        final int[] arr = {1, 2, 3, 4, 5};
        int[] rev = reverseArray(arr);

        printArray(rev);
    }
}