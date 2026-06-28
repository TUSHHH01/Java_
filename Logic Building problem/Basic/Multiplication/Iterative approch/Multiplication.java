class multi
{
    public static void Multi(int num)
    {
        int ans;
        for(int i = 1 ; i <=10 ; i++)
        {
            ans = num * i ;
            System.out.println(num +"*" +i+"=" + ans );
        }
    }
}
public class Multiplication 
{
    public static void main(String args[])
    {
        int number = 7 ;
        multi.Multi(number);
    }
}
