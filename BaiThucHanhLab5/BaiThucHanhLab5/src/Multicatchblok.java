public class Multicatchblok {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        }
        catch (ArithmeticException e){
            System.out.println("task1 is completed");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("task2 is completed");
        }
        catch (Exception e){
            System.out.println("common task completed");
        }
        System.out.println("reset of the code...");
    }

}
