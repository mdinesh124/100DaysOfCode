import java.util.Scanner;
public class Insertion {
    public static void insert(int[] a) {
        int sort = a[a.length - 1];
        int i;
        for (i = a.length - 2; (i >= 0) && (a[i] > sort); i--) {
            a[i + 1] = a[i];
            print(a);
        }
        a[i + 1] = sort;
        print(a);

    }
    
    

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] a = new int[s];
         for(int i=0;i<s;i++){
            a[i]=in.nextInt(); 
         }
         insert(a);
    }
    
    
    private static void print(int[] a) {
      for(int n: a){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    }

