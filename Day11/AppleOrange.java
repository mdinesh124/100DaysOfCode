import java.util.Scanner;
public class AppleOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count=0,orangecount=0;
        int apple[] = new int[m];
        for(int i = 0; i <m;i++)
        {
            apple[i] = sc.nextInt();
        }
        int orange[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            orange[i] = sc.nextInt();
        }
        
        for(int i = 0;i<m;i++)
        {
            apple[i] = apple[i]+a;
            if(apple[i]>=s && apple[i]<=t)
        {
            count++;
        }
        }
        
        for(int i = 0;i<n;i++)
        {
            orange[i] = orange[i]+b;
            if(orange[i]>=s && orange[i]<=t)
        {
            orangecount++;
        }
        }
        System.out.println(count);
        System.out.println(orangecount);



    }
}
