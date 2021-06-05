import java.util.Scanner;


public class Triplet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        int a[] = new int[3];
        for(int i = 0;i<3;i++){
            a[i] = sc.nextInt( );
        }
        int b[] = new int[3];
        for(int i = 0;i<3;i++){
            b[i] = sc.nextInt( );
        }
    
        for(int i=0;i<3;i++)
        {
            
                if(a[i]>b[i])
                {
                    x++;
                }
                else if(a[i]<b[i])
                {
                    y++;
                }
                else{
                    continue;
                }
            
        }
        System.out.println(x+" " +y);
    }
}