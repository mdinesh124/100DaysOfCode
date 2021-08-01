import java.util.*;
public class LargestSubArrSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int bestSum = 0;
        int currentSum = 0;
        for(int i =0; i < length; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > bestSum){
                bestSum = currentSum;
            }else {
                currentSum  = 0;
            }
        }
        System.out.println(bestSum);
    }
}

