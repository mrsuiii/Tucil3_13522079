package utils;
import java.util.HashSet;
import java.util.Set;
public class Neighbour {
    public static Set<String> getNeighbour(String s1, Set<String> sS){
        Set<String> temp = new HashSet<String>(); 
        for(String s:sS){
            if(Validation.is_different1(s,s1)){
                temp.add(s);
                }
            }
        return temp;
    }
    
    
}
