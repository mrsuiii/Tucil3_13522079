import java.util.Set;
import java.util.HashMap;

import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
public class Ucs{
    public static void solve(String start,String end,Set<String> words){
        Map<String,Boolean> visited = new HashMap<>();
        Queue<String> queue =  new LinkedList<>();
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