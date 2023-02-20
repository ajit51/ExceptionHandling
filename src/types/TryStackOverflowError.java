package types;

public class TryStackOverflowError {

    public static void main(String[] args) {
        doNotCodeThis(1);
    }

    private static void doNotCodeThis(int i) {
        doNotCodeThis(1);
    }
}
