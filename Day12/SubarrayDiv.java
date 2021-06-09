import java.util.Scanner;
public class SubarrayDiv {
    static int solve(int n, int[] s, int d, int m) {
        int i = 0, j = 0;
        int sum = 0;
        int counts = 0;
        for(; j < s.length; j++) {
            sum += s[j];
            
            if (sum > d) {
                sum -= s[i];
                i++;
            } else if (j - i == m - 1) {
                if (sum == d) counts++;
                sum -= s[i];
                i++;
            }
        }
        return counts;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solve(n,s,d,m));
    }
}
