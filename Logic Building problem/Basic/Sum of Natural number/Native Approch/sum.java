// Using Loop - O(n) Time and O(1) Space
class test
{
    public static int test1(int num)
    {
        int sum =0 ;
        for(int i=1;i<=num ;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
public class sum 
{
    public static void main(String[] args) {
        System.out.println(test.test1(5));
    }
}
