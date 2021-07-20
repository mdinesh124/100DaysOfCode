import java.util.*;

class MinDiff {
    
    int getMinDiff(int a[], int n){
        Arrays.sort(a);
        
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            res = Math.min(res, a[i] - a[i-1]);
        }
        return res;
    }
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
		a[i] = sc.nextInt();
		
		MinDiff ob = new MinDiff();
		System.out.println(ob.getMinDiff(a, n));
	}
}
