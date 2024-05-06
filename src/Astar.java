import java.util.Set;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
public class Astar {
    public static int cost_counter(String curr,String end ){
        int diff = 0; 
        for(int i=0;i<curr.length();i++){
            if(end.charAt(i)!=curr.charAt(i)){
                    diff++;}
            
        }
        return diff;
    }
    public static void solve(String start,String end,Set<String> words){
        Map<String,Boolean> visited = new HashMap<>();
        
        PriorityQueue<Pair<String,Integer>> queue =  new PriorityQueue<>(Comparator.comparingInt(s->s.getValue()));
        visited.put(start, true);
        Map<String,String> parent =new HashMap<>();
        Map<String,Integer> dist = new HashMap<>();

        queue.add(new Pair<String,Integer>(start, cost_counter(start, end) ));
        boolean Found = false;
        int cnt = 1;
        while(!queue.isEmpty()){
            Pair<String,Integer> current = queue.poll();
            if(current.getKey().equals(end)){
                Found = true;
                break;
            }
            Set<String> neighbour=  utils.Neighbour.getNeighbour(current.getKey(), words);
            for(String s:neighbour){
                if(visited.get(s)==null){
                    cnt++;
                    queue.add(new Pair<String,Integer>(s, cost_counter(current.getKey(), end)+1+current.getValue()));
                    visited.put(s,true);
                    parent.put(s,current.getKey());
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
