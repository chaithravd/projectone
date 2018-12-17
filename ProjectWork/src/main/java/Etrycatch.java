public class Etrycatch {
    public static void main(String[] args){
        int[] arr = new int[4];

        try {
            int i = arr[8];
            System.out.println("try block");
        }

        catch (NullPointerException e){
            System.out.println("Excpetion has occured");
        }

        finally {
            System.out.println("this is a finally block");
        }

        System.out.println("the rest program");
    }
}
