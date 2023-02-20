package types;

public class TryExceptionInInitializerError {

    static {
        int[] countOfmoose = new int[3];
        System.out.println(countOfmoose[-1]);
    }

    public static void main(String[] args) {

    }
}
