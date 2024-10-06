import java.util.Scanner;

class LinearSearch()
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];


        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the elements");
            arr[i]=sc.nextInt();
        }

        System.out.println("Number to search:");
        int search=sc.nextInt();


        for(int i=0;i<=search;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("The number is: " + arr[i]);
                System.out.println("Index: " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Number not found in the array.");
        sc.close();

    }
}