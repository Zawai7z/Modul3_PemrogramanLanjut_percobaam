public class Tugas4 {
    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Min dari (1, 2, 3) = " + findMin(1, 2, 3));
        System.out.println("Min dari (-1, -2, -3) = " + findMin(-1, -2, -3));
        System.out.println("Min dari (0, 0, 1) = " + findMin(0, 0, 1));
    }
}
