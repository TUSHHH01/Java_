public class UsingBitwise 
{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("A befor Swap : " + a);
        System.out.println("B befor Swap : " + b);
        a= a ^ b;
        b= a ^ b;
        a= a ^ b;
        System.out.println("A After Swap : " + a);
        System.out.println("B After Swap : " + b);
    }
}
