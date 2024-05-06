
import java.util.Scanner;
import utils.Dict;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> dict =    Dict.readFromFile("dictionary/dictionary.txt");
        System.out.println("\r\n" + //
                                "░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗  ████████╗░█████╗░\r\n" + //
                                "░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝  ╚══██╔══╝██╔══██╗\r\n" + //
                                "░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░  ░░░██║░░░██║░░██║\r\n" + //
                                "░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░  ░░░██║░░░██║░░██║\r\n" + //
                                "░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗  ░░░██║░░░╚█████╔╝\r\n" + //
                                "░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝  ░░░╚═╝░░░░╚════╝░\r\n" + //
                                "\r\n" + //
                                "░██╗░░░░░░░██╗░█████╗░██████╗░██████╗░██╗░░░░░░█████╗░██████╗░██████╗░███████╗██████╗░\r\n" + //
                                "░██║░░██╗░░██║██╔══██╗██╔══██╗██╔══██╗██║░░░░░██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗\r\n" + //
                                "░╚██╗████╗██╔╝██║░░██║██████╔╝██║░░██║██║░░░░░███████║██║░░██║██║░░██║█████╗░░██████╔╝\r\n" + //
                                "░░████╔═████║░██║░░██║██╔══██╗██║░░██║██║░░░░░██╔══██║██║░░██║██║░░██║██╔══╝░░██╔══██╗\r\n" + //
                                "░░╚██╔╝░╚██╔╝░╚█████╔╝██║░░██║██████╔╝███████╗██║░░██║██████╔╝██████╔╝███████╗██║░░██║\r\n" + //
                                "░░░╚═╝░░░╚═╝░░░╚════╝░╚═╝░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═════╝░╚═════╝░╚══════╝╚═╝░░╚═╝\r\n" + //
                                "\r\n" + //
                                "███╗░░░███╗░█████╗░██╗░░░░░░█████╗░██████╗░██████╗░███████╗███╗░░██╗███╗░░░███╗██╗░░░██╗\r\n" + //
                                "████╗░████║██╔══██╗██║░░░░░██╔══██╗██╔══██╗██╔══██╗██╔════╝████╗░██║████╗░████║██║░░░██║\r\n" + //
                                "██╔████╔██║██║░░╚═╝██║░░░░░███████║██████╔╝██████╔╝█████╗░░██╔██╗██║██╔████╔██║██║░░░██║\r\n" + //
                                "██║╚██╔╝██║██║░░██╗██║░░░░░██╔══██║██╔══██╗██╔══██╗██╔══╝░░██║╚████║██║╚██╔╝██║██║░░░██║\r\n" + //
                                "██║░╚═╝░██║╚█████╔╝███████╗██║░░██║██║░░██║██║░░██║███████╗██║░╚███║██║░╚═╝░██║╚██████╔╝\r\n" + //
                                "╚═╝░░░░░╚═╝░╚════╝░╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚═╝░░╚══╝╚═╝░░░░░╚═╝░╚═════╝░\r\n" + //
                                "\r\n" + //
                                "░██╗░░░░░░░██╗░█████╗░██████╗░███╗░░██╗░█████╗░  ░█████╗░██████╗░░█████╗░░░░██████╗░░█████╗░░██████╗░█████╗░\r\n" + //
                                "░██║░░██╗░░██║██╔══██╗██╔══██╗████╗░██║██╔══██╗  ██╔══██╗██╔══██╗██╔══██╗░░░██╔══██╗██╔══██╗██╔════╝██╔══██╗\r\n" + //
                                "░╚██╗████╗██╔╝███████║██████╔╝██╔██╗██║███████║  ███████║██████╔╝███████║░░░██████╦╝██║░░██║╚█████╗░╚═╝███╔╝\r\n" + //
                                "░░████╔═████║░██╔══██║██╔══██╗██║╚████║██╔══██║  ██╔══██║██╔═══╝░██╔══██║██╗██╔══██╗██║░░██║░╚═══██╗░░░╚══╝░\r\n" + //
                                "░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██║░╚███║██║░░██║  ██║░░██║██║░░░░░██║░░██║╚█║██████╦╝╚█████╔╝██████╔╝░░░██╗░░\r\n" + //
                                "░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝  ╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝░╚╝╚═════╝░░╚════╝░╚═════╝░░░░╚═╝░░");
            
        while(true){
            
            Scanner inp = new Scanner(System.in);
            String start;
            String end;
            System.out.print("Enter start word: ");
            start = inp.nextLine();
            while(!start.matches("[a-zA-Z]+")||!dict.contains(start)){
                if(!start.matches("[a-zA-Z]+")){
                    System.out.println("Input have prohibited character,Enter word again: ");
                    start = inp.nextLine();
                }
                
                if(!dict.contains(start)){
                    System.out.println("Input doesnt exist in dictionary: ");
                    start = inp.nextLine();
                }
                
            }
            System.out.print("Enter end word: ");
            end = inp.nextLine();
            while(!end.matches("[a-zA-Z]+")||!dict.contains(end)){
                if(!end.matches("[a-zA-Z]+")){
                    System.out.println("Input have prohibited character,Enter word again: ");
                    end = inp.nextLine();
                }
                if(!dict.contains(end)){
                    System.out.println("Input doesnt exist in dictionary: ");
                    end = inp.nextLine();
                }
            }
            
            while(!utils.Validation.val_length(start, end)){
                System.out.println("Panjang word harus sama: ");
                System.out.print("Enter start word: ");
                start = inp.nextLine(); 
                while(!start.matches("[a-zA-Z]+")||!dict.contains(start)){
                    if(!start.matches("[a-zA-Z]+")){
                    System.out.println("Input have prohibited character,Enter word again: ");
                    start = inp.nextLine();
                    }
                    if(!dict.contains(start)){
                        System.out.println("Input doesnt exist in dictionary: ");
                        start = inp.nextLine();
                    }
                }
                System.out.print("Enter end word: ");
                end = inp.nextLine();
                while(!end.matches("[a-zA-Z]+")||!dict.contains(end)){
                    if(!end.matches("[a-zA-Z]+")){
                        System.out.println("Input have prohibited character, Enter word again: ");
                        end = inp.nextLine();
                        continue;
                    }
                    if(!dict.contains(end)){
                        System.out.println("Input doesnt exist in dictionary: ");
                        end= inp.nextLine();
                    }
                 }
            }


            System.out.println("Enter algo:\n1.UCS\n2.GBFS\n3.AStar\nYour choice: ");
            String algo = inp.nextLine();
            while(!(algo.equals("1")||algo.equals("2")||algo.equals("3"))){
                System.out.println("Enter choice again: ");
                algo = inp.nextLine();
            }
            if(algo.equals("3")){
                Long startTime = System.currentTimeMillis();
                Astar.solve(start, end, dict);
                Long endTime =  System.currentTimeMillis();
                System.out.println("Elapsed time: "+(endTime-startTime)+"ms");
            }else if(algo.equals("2")){
                Long startTime = System.currentTimeMillis();
                Gbfs.solve(start, end, dict);
                Long endTime =  System.currentTimeMillis();
                System.out.println("Elapsed time: "+(endTime-startTime)+"ms");
            }else if(algo.equals("1")){
                Long startTime = System.currentTimeMillis();
                Ucs.solve(start, end, dict);
                Long endTime =  System.currentTimeMillis();
                System.out.println("Elapsed time: "+(endTime-startTime)+"ms");
            }
            System.out.println("Quit(Y/N): ");
            String isQuit = inp.nextLine();
            
            if(isQuit.toLowerCase().equals("y")){
                inp.close();
                break;
            }
        }
        
    }
}
