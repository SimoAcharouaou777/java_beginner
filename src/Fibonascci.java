public class Fibonascci {
    public static void main(String[] args) {
        int n = 20;
        int first = 0;
        int second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
