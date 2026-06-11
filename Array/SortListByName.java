package Array;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name;
    }
}

class byName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class SortListByName {
    public static void main(String[] args) {
        Student st1 = new Student("Abhay", 1);
        Student st2 = new Student("Abay", 2);
        Student st3 = new Student("Aabhay", 3);

        List<Student> l = new ArrayList<>();
        l.add(st1);
        l.add(st3);
        l.add(st2);

        Collections.sort(l);
        System.out.println(l);
    }
}
