package streamPractice;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Students> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Students("Di", "", 0, Faculty.BCA));
        listOfStudents.add(new Students("Dipesh", "", 0, Faculty.BBS));
        listOfStudents.add(new Students("Trilo", "", 0, Faculty.BCA));
        listOfStudents.add(new Students("Bibush", "", 0, Faculty.BCA));
        listOfStudents.add(new Students("pesh", "", 0, Faculty.BBA));
        listOfStudents.add(new Students("Dipesh", "", 0, Faculty.BCA));
        listOfStudents.add(new Students("Dish", "", 0, Faculty.BCA));


        List<Students> newListOfStudents = listOfStudents.stream()
                .filter(student -> Faculty.BBA.equals(student.getFaculty()))
                .collect(Collectors.toList());
        System.out.println(newListOfStudents);


    }
}
