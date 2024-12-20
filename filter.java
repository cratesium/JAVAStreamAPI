package StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        //filter odd numbers from the list
        System.out.println("original list ");
        System.out.println(list);

          List <Integer> newList = list.stream().filter(i->i%2==1).toList();
        System.out.println("new List : -");
        System.out.println(newList);

        //filter is used just to filter from current stream not transform the stream 



    }
    
}
