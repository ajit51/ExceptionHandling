package handlingException;

import java.util.Scanner;

public class OrderOfOperation {
    public static void main(String[] args) throws Exception {

        try (MyFileClass f1 = new MyFileClass(1);
             MyFileClass f2 = new MyFileClass(2);) {
            System.out.println("try block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        }finally {
            System.out.println("#finally");
        }

        try (var f1 = new MyFileClass(1);
             var f2 = new MyFileClass(2);) {
            System.out.println("try block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        }finally {
            System.out.println("#finally");
        }

        try (var f1 = new MyFileClass(1);
             var f2 = new MyFileClass(2);) {
            System.out.println("try block");
            throw new RuntimeException();
        }
    }

   /* public void print(){
        try (Scanner s = new Scanner(System.in)){
            s.nextLine();
        }catch (Exception e){
            s.nextLine();
        }finally {
            s.nextLine();
        }
    }*/
}
