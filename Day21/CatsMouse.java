import java.util.Scanner;
public class CatsMouse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(Math.abs(x-z)<Math.abs(y-z))
            {
                System.out.println("Cat A");
            }
            else if(Math.abs(x-z)>Math.abs(y-z))
            {
                System.out.println("Cat B");
            }
            else
            {
                System.out.println("Mouse C");
            }
        }
    }
}
