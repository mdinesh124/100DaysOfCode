 
import java.util.Scanner;
public class CountingValleys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String str = in.next();
        new Solver().solve(str);
    }
}

class Solver {
    public void solve (String str) {
        int currLevel = 0;
        int valley = 0;
        boolean isFound = false;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'U') {
                currLevel++;
            } else {
                currLevel--;
            }

            if (currLevel < 0){
                isFound = true;
            }

            if (currLevel >= 0  && isFound) {
                isFound = false;
                valley++;
            }

        }
        System.out.println(valley);
    }
}
