import java.util.Scanner;
public class Migratory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++) {
        birds[in.nextInt()-1]++;
        }
        int max = 0;
        int id = 0;
        for (int i = 0; i < n; i++) {
            if (birds[i] > max) {
                max = birds[i];
                id = i+1;
            }
        }
        System.out.println(id);
    }
}
