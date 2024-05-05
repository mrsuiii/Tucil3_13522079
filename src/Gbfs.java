
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Gbfs{
    public static int cost_counter(String start,String curr ){
        int diff = 0; 
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!=curr.charAt(i)){
                diff++;
            }
        }
        return diff;
    }

    public static void solve(String start,String end,Set<String> words){
        Map<String,Boolean> visited = new HashMap<>();
        Queue<String> queue =  new PriorityQueue<>(Comparator.comparing(s->cost_counter(s,end)));
        visited.put(start, true);
        Map<String,String> parent =new HashMap<>();
        queue.add(start);
        boolean Found = false;
        int cnt = 1;
        while(!queue.isEmpty()){
            String current = queue.poll();
            if(current.equals(end)){
                Found = true;
                break;
            }
            Set<String> neighbour=  utils.Neighbour.getNeighbour(current, words);
            
            for(String s:neighbour){
                if(visited.get(s)==null){
                    cnt++;
                    visited.put(s,true);
                    queue.add(s);
                    parent.put(s,current );
                }
            }        
        }
        ArrayList<String> path =  new ArrayList<>();
        if(Found){
            String curr  = end ;
            while(!curr.equals(start)){
                path.add(0,curr);
                curr = parent.get(curr);
            }
            if(curr.equals(start)){
                path.add(0, curr);
            }
        }
        for(String word: path){
            System.out.println(word);
        }
        System.out.println("Visited node: "+ cnt);
        System.out.println("Length Solution : "+ (path.size()-1));
    }

}