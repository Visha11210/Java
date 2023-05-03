import java.util.Scanner;


class Prime
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a Value : ");
        int a = sc.nextInt();
        System.out.println("Enter the b Value : ");
        int b = sc.nextInt();
        
        for(int i=a;i<=b;i++)
    { 

        if(isprime(i))
        {
         System.out.println(i);    
        }
    }
}
        public static boolean isprime (int n) 
        {
            if(n<=1) /*If condition is true it goes inside the block, If false goes outside the block */
            {
                return false;
            }
            for(int i=2;i<=n/2;i++)/*If above condition false */
            {
                if(n%i==0)
                {    
                 return false; /*Return type boolean it returns value to isprime method */  
                }    
            }    
            return true;
        }
}  
      
