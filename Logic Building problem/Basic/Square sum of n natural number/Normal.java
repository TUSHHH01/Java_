class Normal
{
    static int naturalSquareSum(int num)
    {
        int sum = 0;
        for(int i = 1 ;i <= num ; i++)
        {
            sum=sum+(i*i);
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(naturalSquareSum(8));
    }
}