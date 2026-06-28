public class sum {
    static int naturalNumberSum(int num)
    {
        if(num == 1)
        {
            return 1;
        }
        return num+ naturalNumberSum(num-1);
    }
    public static void main(String[] args) {
        System.out.println(naturalNumberSum(5));
    }
}
