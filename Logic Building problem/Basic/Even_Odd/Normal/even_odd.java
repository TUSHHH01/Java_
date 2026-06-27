public class even_odd {
    public static boolean checkeven_odd(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int num = 7;
        if(checkeven_odd(num))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
    }
}
