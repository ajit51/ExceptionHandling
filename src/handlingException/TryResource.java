package handlingException;

import java.io.FileInputStream;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) {

    }

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readFile2(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt");) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
