import java.util.Map;
import java.util.HashMap;
import java.util.*;
public class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res[] = numbers(arr,target);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] numbers(int arr[],int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int x = target-arr[i];
            if(map.containsKey(x)) {
                return new int[]{i,map.get(x)};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}