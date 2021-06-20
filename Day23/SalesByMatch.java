import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SalesByMatch {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] colors=new int[101];
int ans=0;
int n=sc.nextInt();
for(int i=0;i<n;i++){
int color=sc.nextInt();
colors[color]++;
if(colors[color]%2 == 0){
ans++;
colors[color] = 0;
}
}
System.out.println(ans);
}
}
