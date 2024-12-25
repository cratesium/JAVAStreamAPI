package StreamApi;

import java.util.Arrays;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(11,22,32,42,52);
        //count the numnber of elements in stream 
        // count() function returns Long

        long total = list.stream().count();
        System.out.println(total);

       long longPassedStudents =list.stream().filter(i->i>=30).count();
       System.out.println("passed students are : "+longPassedStudents);
    }
    
}
