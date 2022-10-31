public class Main {
    public static void main(String[] args) {
        int b =0;
        try{
            System.out.println(0/0);
        }catch (ArithmeticException e){
            System.err.println("Ноль на ноль нельзя делить потому как ответ будет ->0!!!");
        }
    }
}
