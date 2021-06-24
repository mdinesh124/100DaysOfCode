import java.util.*;
public class BeautifulDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i  = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        for (int l=i;l<=j; l++){
            StringBuilder temp = new StringBuilder();
            temp.append(l);
            temp=temp.reverse();
            String temp1 = temp.toString();
            int aRev = Integer.parseInt(temp1);
            if(Math.abs((l-aRev)%k)==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
