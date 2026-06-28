public class SwapNumberWithVariable {
    public static void main(String[] args) {
        int a = 1;
        int b = 2 ;
        System.out.println("A before swap : "+a);
        System.out.println("B before swap : "+b);

        int temp ;
        temp = b;
        b = a;
        a = temp ;
        System.out.println("A after swap : "+a);
        System.out.println("B after swap : "+b);
    }
}
