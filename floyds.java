import java.util.*;
public class floyds{
    void flyds(int [][]w,int n)
    {
        int i,j,k;
        for(k=1;k<=n;k++)
        for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
        w[i][j] = Math.min(w[i][j],w[i][j]+w[i][j]);

    }
    public static void main(String[] args) {
        int a[][] = new int [10][10];
        int n,i,j;
        System.out.println("Enter the number of vertices");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.println("Enter the weighted matrix");
        for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
        a[i][j] = sc.nextInt();
        floyds f = new floyds();
        f.flyds(a,n);
        System.out.println("The shortest path matrix is ");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();

        }
        sc.close();


    }
}

