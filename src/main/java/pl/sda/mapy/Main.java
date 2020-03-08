package pl.sda.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

   /*     Generyka<String> generyka = new Generyka<String>("Test");
        System.out.println(generyka.getField());

        Generyka<Integer> generyka1 = new Generyka<Integer>(223344);
        System.out.println(generyka1.getField());

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jan");
        map.put(2, "Ewa");
        map.put(3, "Tomek");
        map.put(4, "Kamila");
        System.out.println(map);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + "; " + "Wartość: " + entry.getValue());

    */
        Student student1 = new Student("Ewa", "Kowalik");
        Student student2 = new Student("Jan", "Nowak");
        Student student3 = new Student("Marek", "Chomik");
        Student student4 = new Student("Alina", "Sloik");
        Student student5 = new Student("Wladek", "Sloik");
        Student student6 = new Student("Marzena", "Michalek");
        Student student7 = new Student("Andrzej", "Gloch");
        Student student8 = new Student("Miron", "Polko");
        Student student9 = new Student("Mirek", "Kowal");

        School school1 = new School("SDA", "Gdansk");
        School school2 = new School("UMK", "Torun");
        School school3 = new School("UJ", "Krakow");

        ArrayList<Student> listaStudentow1 = new ArrayList<Student>();
        listaStudentow1.add(student1);
        listaStudentow1.add(student2);
        listaStudentow1.add(student3);


        ArrayList<Student> listaStudentow2 = new ArrayList<Student>();
        listaStudentow2.add(student4);
        listaStudentow2.add(student5);
        listaStudentow2.add(student6);


        ArrayList<Student> listaStudentow3 = new ArrayList<Student>();
        listaStudentow3.add(student7);
        listaStudentow3.add(student8);
        listaStudentow3.add(student9);

        Map<School, List<Student>> map = new HashMap<School, List<Student>>();
        map.put(school1, listaStudentow1);
        map.put(school2, listaStudentow2);
        map.put(school3, listaStudentow3);

        for (Map.Entry<School, List<Student>> entry : map.entrySet()) {
            System.out.println(" - " + entry.getKey().getName());
            System.out.println();
            for (Student s : entry.getValue()) {
                System.out.println("    - " + s.getName() + " " + s.getLastName());
            }
        }
    }
}
