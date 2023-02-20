package types;

public class TryArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] countOfmoose = new int[3];
        System.out.println(countOfmoose[-1]);
    }
}
