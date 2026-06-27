public class even_odd {
    public static boolean checkeven_odd(int n)
    {
        if((n&1)==0)
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
https://github.com/TUSHHH01/Java_
git remote add origin https://github.com/TUSHHH01/Java.git