import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i,j;
        for (i = 0; i < a; i++)
        {
            // Print stars for each solid rows
            if (i == 0 || i == a-1)
                for (j = 0; j < a; j++)
                    System.out.print("*");
     
            // stars for hollow rows
            else
                for (j = 0; j < a; j++)
                    if (j == 0 || j == a-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
     
            // Move to the next line/row
            System.out.print("\n");
        }
    }
}

