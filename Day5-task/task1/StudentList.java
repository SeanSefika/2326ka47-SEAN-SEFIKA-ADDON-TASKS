package task1;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> students = new ArrayList<>();

        students.add("Sefi");
        students.add("Steve");
        students.add("Fenicus");

        Iterator<String> iterator = students.iterator();

        System.out.println("List of Students:");
        while (iterator.hasNext()) 
        {
            String student = iterator.next();
            System.out.println(student);
        }
    }
}

