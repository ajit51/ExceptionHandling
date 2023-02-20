package methodThowException;

import java.io.FileNotFoundException;
import java.io.IOException;

class NoMoreCarrotsException extends Exception {
}

public class Bunny {
    public static void main(String[] args) {

        /*try {
            eatCarrot();
        }catch (NoMoreCarrotsException e){

        }*/

        try {
            eatCarrot();
        } catch (NullPointerException e) {

        }

        try {
            eatCarrot();
        } catch (Exception e) {

        }


    }

    public void good() throws NoMoreCarrotsException{
        eatCarrot();
    }

    public static void eatCarrot() {

    }
}
