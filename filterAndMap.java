package StreamApi;

import java.util.Arrays;
import java.util.List;

public class filterAndMap {
    //select only passed students form the arraylist in which marks are given 
    // and add 5 as grace marks to all the students who failed 

    public static void main(String[] args) {
         List<Integer> marks = Arrays.asList(30,21,34,56,78,90,99,76,65,45,43,23,2,31,11,12,23,34,45,55);
         //selecting passed student 
         List<Integer> passedStudents = marks.stream().filter(i-> i>=30).toList();
                  //selecting failed students 
                  List<Integer>failedStudents=marks.stream().filter(i->i<30).toList();
                  
         
                  System.out.println("pass "+passedStudents);
                  System.out.println("failed"+failedStudents);
                   // adding 5 as grace to failed students 
         
                   List<Integer> graceMarks = marks.stream() .filter(i->i<30)//first filter all who failed 
                  .map(i->i+5) //add 5 grace to failed 
                  .toList(); //return in new list 

                  System.out.println("grace Marks "+graceMarks);


    }
    
}
