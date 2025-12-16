public class ExceptionHendling {
    public static void main(String[] args) {
        int a=234;
        int b=0;
        try{
            int c=a/b;
            System.out.println("show answer"+c);
        }
        catch (ArithmeticException e){
            System.out.println("error: division by 0");
        }
        finally {
            System.out.println("end the code");
        }

    }
}
