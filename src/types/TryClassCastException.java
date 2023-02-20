package types;

public class TryClassCastException {
    public static void main(String[] args) {
        String type = "moose";
        Object obj = type;
        Integer number = (Integer) obj;
    }
}
