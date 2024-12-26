package StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdditionalCodes {

   public static void main(String[] args) {
    List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9);

    System.out.println("----------------list -------------");
    System.out.println("min is "+Collections.min(list));
    System.out.println("max is "+Collections.max(list));    

    
    int [] nums ={1,2,3,4,5,6,7,8,9,90};
    System.out.println("--------------array---------------");

     System.out.println(Arrays.stream(nums).min().getAsInt());
     System.out.println(Arrays.stream(nums).max().getAsInt());



   
    // System.out.println("min is "+Collections.min(list));
    // System.out.println("max is "+Collections.max(list));    

   }

    
}
