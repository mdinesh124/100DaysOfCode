import java.util.*;
public class Hashset {
    public static void main(String[] args){
    HashSet<Integer> h = new HashSet<Integer>();
    h.add(47);
    h.add(39);
    h.add(28);
    System.out.println(h.size());
    h.remove(39);
    System.out.println(h.size());;
    for(Integer s:h){
        System.out.println(s+" ");

    }
    System.out.println(h.isEmpty());


    }
}
