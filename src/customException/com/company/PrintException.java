package customException.com.company;

public class PrintException {

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.getStackTrace());
        }
    }

    private static void hop() {
        throw new RuntimeException("Cannot hop");
    }
}
