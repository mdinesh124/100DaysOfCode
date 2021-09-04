import java.util.*;
public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=0;j<10;j++)
        {
            if((x*10+j)%y==0) {
                System.out.println(x*10+j);
                break;
            }
        }
        }
    }
}
