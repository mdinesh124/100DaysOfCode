import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for (int j = 0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }

        } int x=0,y=0;
        for(int i = 0;i<n;i++)
        {
            for (int j = 0;j<n;j++)
            {if(i==j){
                x = x+a[i][j];
            }
            }
            
        }
        for(int i = 0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if((i+j)==n-1)
                y = y+a[i][j];
            
            }
            
        }
        int z = x-y;
        System.out.println(Math.abs(z));
    }
}
