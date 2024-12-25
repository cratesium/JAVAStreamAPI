package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class customSorting {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,22,32,22,11,2,3,4,5);
        List<Integer>sortedList= list.stream().sorted().toList();  
        System.out.println("Natural Sorting "+sortedList);

        //custom sorting 
  

        //method 1  lambda statement 
        List<Integer>revIntegers = list.stream().sorted((a,b)-> a<b?1:(a>b ? -1:0) ).toList();
        System.out.println(revIntegers);
   

        //method 2 uisng comapartor 
        List<Integer>rIntegers=list.stream().sorted(Comparator.reverseOrder()).toList();

         System.out.println(rIntegers);



         //example 
         System.out.println("example ");
         //AA BB CCC A , B, CCC
         List<String> strings = Arrays.asList("A","BB","B","CCC","D","DD","AAAAAA");
         List<String> main=strings.stream().sorted().toList(); //will sort lexicographically  [A, AAAAAA, B, BB, CCC, D, DD]
         System.out.println(main);

         //sort based on the length of the string 

         List<String> revList = strings.stream().sorted(new Comparator<String>() {
        public int compare( String a , String b){
            return Integer.compareUnsigned(a.length(), b.length());
        }
         }).toList();
         System.out.println(revList);
     
    
        
    
    
    
    }
    
}
