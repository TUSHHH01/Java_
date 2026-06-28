public class Without3rdVariable 
{
    public static void main(String[] args) 
    {
        int a = 1;
        int b = 2;
        System.out.println("A befor Swap : " + a);
        System.out.println("B befor Swap : " + b);

        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("A After Swap : " + a);
        System.out.println("B After Swap : " + b);

    }    
}
