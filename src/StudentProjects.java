import java.util.ArrayList;
import java.util.Comparator;

public class StudentProjects {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "John", "123 Main St"));
        students.add(new Student(102, "Alice", "456 Oak St"));
        students.add(new Student(103, "Bob", "789 Pine St"));
        students.add(new Student(104, "Eva", "567 Elm St"));
        students.add(new Student(105, "Mike", "890 Cedar St"));
        students.add(new Student(106, "Sarah", "234 Maple St"));
        students.add(new Student(107, "Chris", "678 Birch St"));
        students.add(new Student(108, "Emily", "345 Pine St"));
        students.add(new Student(109, "Daniel", "901 Oak St"));
        students.add(new Student(110, "Linda", "432 Main St"));
        
        SelectionSort.selectionSort(students, new NameComparator());

        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student.name() + " - " + student.rollno());
        }


        SelectionSort.selectionSort(students, new RollNoComparator());


        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student.rollno() + " - " + student.name());
        }
    }
}

    class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name().compareTo(s2.name());
        }
    }


    class RollNoComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.rollno(), s2.rollno());
        }
    }
