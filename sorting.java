package StreamApi;

import java.util.Arrays;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,22,32,22,11,2,3,4,5);
        List<Integer>sortedList= list.stream().sorted().toList();
        System.out.println(sortedList);
        Object [] sortedArray = list.stream().sorted().toArray();
        System.out.println();
        for (Object i : sortedArray) {
            System.out.print(i +" ");
            
        }
        System.out.println();
    
    }
    
}
