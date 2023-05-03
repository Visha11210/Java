import java.util.Scanner;

class Even
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value");
        int m = sc.nextInt();
        System.out.println("Enter the end value");
        int n = sc.nextInt();

        for(int i = m;i<=n;i++)
        {
            if(isOdd(i))
            {
                System.out.println(i+" "+ "Odd");
            }
            System.out.println(i+" "+ "Even");
        }
    }
    public static boolean isOdd(int b)
    {
        for(int i =0;i<=b/2;i++)
        {
            if(b%2==1)
            {
                return true;
            }
            return false;
        }
        return false;
    }
    
}
