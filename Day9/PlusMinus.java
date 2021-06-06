import java.util.Scanner;
public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i= 0 ;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int x=0,y=0,z=0;
        for(int i = 0;i<n;i++)
        {
            if (a[i]<0)
            {
                x++;
            }
            else if(a[i]>0)
            {
                y++;
            }
            else{
                z++;
            }
            
        } float b =(float) y/n;
        float c = (float)x/n;
        float d = (float)z/n;
        System.out.printf("%.6f\n",b);
        System.out.printf("%.6f\n",c);
        System.out.printf("%.6f\n",d);
            
    }
}
