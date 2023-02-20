package customException.com.company;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws CanNotSwimException {
       // throw new CanNotSwimException();
       // throw new CanNotSwimException("broken fin");
        throw new CanNotSwimException(new FileNotFoundException("Cannot find shark file"));
    }
}
