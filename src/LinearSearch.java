import java.util.Scanner;
public class LinearSearch {
    static int countElements(int A[],int B)
    {
        int size=A.length;
        int counter=0;
        for (int i=0;i<size;i++)
        {
            if(A[i]==B)
                counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int B=scanner.nextInt();
        int count=countElements(A,B);
        System.out.println(count);
    }
}
