import java.util.Scanner;

class Fibanossi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value");
        int a = sc.nextInt();
        System.out.println("Enter the end value");
        int b = sc.nextInt();
        int c,count = 0;

            for(int i=a;i<=b;i++)
            {
                c = a+b;
                if (c>=a) 
                {
                    System.out.println(c);
                    count++;
                  
                }
                if(count==10)
                {
                    break; 
                }

                a=b;
                b=c;
            }
            
           
        
        

    }
}
