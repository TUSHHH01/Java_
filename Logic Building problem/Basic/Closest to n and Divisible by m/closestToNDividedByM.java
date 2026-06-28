public class closestToNDividedByM 
{
    public static void main(String[] args) 
    {
        int n = -15 ;
        int m = 6 ;
        if(n%m==0)
        {
            System.out.println(n);
            return;
        }

        int n1 =0;
        int n2 =0;
        for(int i = 1; i <= m ; i++)
        {  
            int add = n + i;
            int sub = n - i;
            
            if(add%m==0)
            {
                n1 = add;
            }
            if(sub%m==0)
            {
                n2 = sub;
            }
            if(Math.abs(n1)!=0 || Math.abs(n2)!=0)
            {
                if(Math.abs(n1)>Math.abs(n2))
                {
                    System.out.println(n1);
                    break;
                }
                else
                {
                    System.out.println(n2);
                    break;
                }

            }
        }
        
    } 
}
