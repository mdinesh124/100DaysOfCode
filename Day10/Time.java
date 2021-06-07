import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int hh= Integer.valueOf(time.substring(0,2));
        int mm= Integer.valueOf(time.substring(3,5));
        int ss= Integer.valueOf(time.substring(6,8));
        String m=time.substring(8,10);
        if(m.equals("AM") && hh==12)
        {
            hh = 12-12;
        }
        if(m.equals("PM") && hh<12)
        {
            hh+=12;
        }
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);

       
    }
}
