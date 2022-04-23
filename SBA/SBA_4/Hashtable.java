package SBA_4;

import java.util.*;  
class Q3{  
 public static void main(String args[]){  
    Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
     map.put(100,"marthin");    
     map.put(102,"Rajendra");   
     map.put(101,"Ramesh");    
     map.put(103,"Rajiv");    
     System.out.println("Initial Map: "+map);  
     //Inserts, as the specified pair is unique  
     map.putIfAbsent(104,"Gaurav");  
     System.out.println("Updated Map: "+map);  
     //Returns the current value, as the specified pair already exist  
     map.putIfAbsent(101,"Rajiv");  
     System.out.println("Updated Map: "+map);  
 }  
} 
