package exception;

public class MyTry {
    public static void main(String[] args) throws Exception {
        //1. without curly braces, it won't compile
        /*try
            fall();
        catch (Exception e)
            System.out.println("get up!!");*/

        //2. order of try, catch, finally block
       /* try{
            fall();
        }finally {
            System.out.println("all better");
        }catch (Exception e){
            System.out.println("get up!!");
        }*/

        //3. not allowed only try block
       /* try{
            fall();
        }*/

        //4.
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up!!");
        }

        //5.
        try {
            fall();
        } finally {
            System.out.println("all better");
        }

        //6.
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up!!");
        } finally {
            System.out.println("all better");
        }


    }

    private static void fall() throws Exception {
        throw new Exception("get up...");
    }
}
