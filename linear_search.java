import java.util.Scanner;
public class linear_search
{
    public static void main(String args [])
    {
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.println("Enter the size: ");
                int a=sc.nextInt();
                int [] arr =new int[a];

                for(int i=0;i<a;i++)
                {
                    System.out.println("Enter the Elements: ");
                    arr[i]=sc.nextInt();
                }

                System.out.println("Element to search: ");
                int z=sc.nextInt();

                int temp=0;
                for(int i=0;i<z;i++)
                {
                    if(arr[i]==z)
                    {
                        System.out.println("Element found through linear search: "+ i);
                        temp=temp+1;
                    }
                }

                if(temp==0)
                {
                    System.out.println("Element not found at index: "+ temp);
                }
            }
        }
    }
}