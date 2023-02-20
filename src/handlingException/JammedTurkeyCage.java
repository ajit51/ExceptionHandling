package handlingException;

public class JammedTurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IllegalArgumentException {
        throw new IllegalArgumentException("Cage door does not close");//Suppressed exception
    }

    public static void main(String[] args) {
        try (var t = new JammedTurkeyCage()) {
            throw new RuntimeException("Turkey ran off");//primary exception
        } catch (IllegalArgumentException ex) {
            System.out.println("caught: " + ex.getMessage());
        }
    }
}
