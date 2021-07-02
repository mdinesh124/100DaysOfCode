import java.util.*;
public class Hash {
    public static void main(String[] args){
    HashSet<String> h = new HashSet<String>();
    h.add("10");
    h.add("20");
    h.add("30");
    System.out.println(h);
    System.out.println(h.contains("10"));
    Iterator<String> i = h.iterator();
    while(i.hasNext())
    {
        System.out.println(i.next());
    }


    }
}
