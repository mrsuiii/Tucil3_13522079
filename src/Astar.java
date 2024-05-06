import java.util.Set;


import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Queue;

import java.util.ArrayList;
import java.util.Comparator;



public class Astar {

    public static int cost_counter(String start,String curr,String end ){
        int diff = 0; 
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!=curr.charAt(i)){
                diff++;
            }if(curr.charAt(i)!=end.charAt(i)){
                diff++;
            }
        }
        return diff;
    }

    public static void solve(String start,String end,Set<String> words){
        Map<String,Boolean> visited = new HashMap<>();
        PriorityQueue<String> queue =  new PriorityQueue<>(Comparator.comparing(s->cost_counter(start,s,end)));
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
                    queue.add(s);
                    visited.put(current,true);
                    parent.put(s,current);
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
