import java.util.*;
public class SquareRoot {
    public static int square(int x)
    {
        int low=1,high=x, ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int sq = mid*mid;
            if(x==sq)
            {
                return mid;
            }

            else if(x<sq)
            {
                 high=mid-1;
                
            }
            else 
            {
                 low=mid+1;
                 ans=mid;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(square(x));

    }
}
