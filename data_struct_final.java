
/*
 * @author Coronel, Paul Andrie N.
 */

import java.util.*;

public class data_struct_final {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        queues que = new queues();
        Stacks stck = new Stacks();
        
        char yes = 'n';
        boolean checker = true;
        
        do{
            System.out.println("Welcome to my Program");
            System.out.println("---------------------");
            System.out.println("★Compilation of Codes");
            System.out.println("\n[1] Array");
            System.out.println("[2] Simple Sorting");
            System.out.println("[3] Recursion");
            System.out.println("[4] Stack");
            System.out.println("[5] Queues");
            System.out.println("[6] Linked list");
            System.out.println("[any key] Exit");
            System.out.println("---------------------");
            System.out.print("enter your choice: ");
            char choice = input.next().charAt(0);

            switch(choice){
            
                case '1':{
                    System.out.println("\n----------------------------");
                    System.out.println("Sample program using ARRAY");
                    System.out.println("----------------------------");
                    System.out.println("input 5 names:");
                    String[] ra = new String[5];
                    
                    for(int x = 0; x < 5; x++){
                        ra[x] = input.next();
                    }
                    System.out.println("----------------------------");
                    System.out.println("Displaying of the ARRAY");
                    System.out.println("list of the names entered:");
                    for(String names: ra){
                        System.out.println(names);
                    }
                    System.out.println("----------------------------");
                    checker = true;
                    break;
                }    
                case '2':{
                    System.out.println("\n---------------------------");
                    System.out.println("Sample of Simple Sorting");
                    System.out.println("---------------------------");
                    String[] ra = {"Rencie","Wilkins", "Francis", "Kenneth", "Ian"};
                    
                    System.out.println("list of the names that will");
                    System.out.println("be sorted using bubble sort:");
                    
                    for(String names: ra){
                        System.out.println(names);
                    }
                    
                    for(int x = 0; x < 5; x++){
                        for(int y = 0; y < 4; y++){
                            if(ra[y].compareTo(ra[y+1]) > 0){
                                String temp = ra[y];
                                ra[y] = ra[y+1];
                                ra[y+1] = temp;
                            }
                        }
                    }
                    System.out.println("---------------------------");
                    System.out.println("Sorted list:");
                    for(String names: ra){
                        System.out.println(names);
                    }
                    System.out.println("---------------------------");
                    checker = true;
                    break;
                }
                    
                case '3':{
                    System.out.println("\n------------------------------");
                    System.out.println("Sample program using recursion");
                    System.out.println("------------------------------");
                    try{    
                        System.out.print("enter a number to be factorial: ");
                        int num = input.nextInt();
                        System.out.println(num + "! = " + que.recursion(num));
                    }catch(Exception e){
                        System.out.println("you entered a non integer");
                    }
                    System.out.println("------------------------------");
                    checker = true;
                    break;
                }
                    
                case '4':{
                    System.out.println("\n--------------------------");
                    System.out.println("Sample program using stack");
                    System.out.println("--------------------------");
                    
                    stck.push(1);
                    stck.push(2);
                    stck.push(3);
                    stck.push(4);
                    stck.push(5);
                    System.out.println("push: 1");
                    System.out.println("push: 2");
                    System.out.println("push: 3");
                    System.out.println("push: 4");
                    System.out.println("push: 5");
                    
                    System.out.println("--------------------------");
                    stck.show();
                    
                    stck.pop();
                    stck.pop();
                    System.out.println("pop()");
                    System.out.println("pop()");
                    System.out.println("--------------------------");
                    stck.show();
                    System.out.println("--------------------------");
                    checker = true;
                    break;
                }
                    
                case '5':{
                    System.out.println("\n--------------------------");
                    System.out.println("Sample program using queue");
                    System.out.println("--------------------------");
                    
                    que.push(1);
                    que.push(2);
                    que.push(3);
                    que.push(4);
                    que.push(5);
                    System.out.println("push: 1");
                    System.out.println("push: 2");
                    System.out.println("push: 3");
                    System.out.println("push: 4");
                    System.out.println("push: 5");
                    
                    System.out.println("--------------------------");
                    que.show();
                    
                    que.pop();
                    que.pop();
                    System.out.println("pop()");
                    System.out.println("pop()");
                    System.out.println("--------------------------");
                    que.show();
                    System.out.println("--------------------------");
                    checker = true;
                    break;
                }
                    
                case '6':{
                    System.out.println("\n--------------------------------");
                    System.out.println("Sample program using linked list");
                    System.out.println("--------------------------------");
                    
                    LinkedList<String> list = new LinkedList<String>();
                    
                    list.add("Diether");
                    list.add("Sean");
                    list.add("Rommel");
                    System.out.println("add: Diether");
                    System.out.println("add: Sean");
                    System.out.println("add: Rommel");
                    System.out.println("Linked list: " + list);
                    System.out.println("--------------------------------");
                    list.addFirst("Rose");
                    System.out.println("add to first spot: Rose");
                    list.addLast("Aljon");
                    System.out.println("add to last spot: Aljon");
                    list.add(2, "Ellizer");
                    System.out.println("add to 3rd spot: Ellizer");
                    System.out.println("linked List: " + list);
                    System.out.println("--------------------------------");
                    checker = true;
                    break;
                }
                
                case '7':{
                    checker = false;
                
                    break;
                }
                    
                default:{
                    checker = false;
                    break;
                }
                  
            }
            
            if(checker){
                System.out.print("\nreturn to main menu?[y/n]: ");
                yes = input.next().charAt(0);
                yes = input.next().charAt(0);
            }
            
        }while(yes == 'y');
        
        System.out.println("\nthank you for using me *^u^* ");
    }
    
}//System.out.println();
