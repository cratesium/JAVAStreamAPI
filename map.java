package StreamApi;

import java.util.Arrays;
import java.util.List;

public class map {
    //map is used to transform the list map returns basically new stream 
    //takes functions as input 
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
    System.out.println("original list is :-"+list);
    //applying map to multiply all numbers by 2 
    List<Integer> newlist = list.stream().map(i->i*2).toList();
    System.out.println("after applying map : "+newlist);

}      

    
    
}
