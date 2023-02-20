package customException.com.company;

class CanNotSwimException extends Exception {
    public CanNotSwimException() {
        super();
    }
    public CanNotSwimException(Exception e){
        super("Cannot swim because " + e);
    }

    public CanNotSwimException(String message){
        super(message);
    }
}

class DangerInWater extends RuntimeException {
}

class SharkInTheWaterException extends DangerInWater {
}

public class Dolphin {
    public void swim() throws CanNotSwimException{

    }
}
