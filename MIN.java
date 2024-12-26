package StreamApi;

import java.util.Arrays;

public class MIN {
     public static void main(String[] args) {
        

        int [] nums ={1,2,3,4,5,5};
      
        int min = Arrays.stream(nums).min().getAsInt();
        int max= Arrays.stream(nums).max().getAsInt();

        System.out.println("min and max are "+ min +" "+max);
    
}
}
