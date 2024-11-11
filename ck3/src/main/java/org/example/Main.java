package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Антон", "Б-213", 1, List.of(4, 5, 3, 2, 4, 5, 3)));
        students.add(new Student("Мария", "Б-214", 2, List.of(5, 4, 4, 5, 5, 3, 4)));
        students.add(new Student("Сергей", "Б-215", 3, List.of(3, 2, 2, 4, 3, 4, 5)));
        students.add(new Student("Елена", "Б-216", 4, List.of(5, 5, 5, 4, 5, 4, 5)));
        students.add(new Student("Дмитрий", "Б-213", 1, List.of(3, 3, 4, 2, 3, 4, 3)));
        students.add(new Student("Александра", "Б-214", 2, List.of(4, 5, 4, 4, 4, 3, 5)));
        students.add(new Student("Иван", "Б-215", 3, List.of(2, 2, 3, 3, 4, 2, 3)));
        students.add(new Student("Ольга", "Б-216", 4, List.of(5, 4, 5, 5, 5, 5, 4)));
        students.add(new Student("Никита", "Б-213", 1, List.of(1, 2, 1, 2, 1, 2, 1)));
        students.add(new Student("Татьяна", "Б-214", 2, List.of(4, 4, 5, 4, 4, 4, 5)));
        students.add(new Student("Максим", "Б-215", 3, List.of(3, 3, 3, 3, 3, 3, 3)));
        students.add(new Student("Анна", "Б-216", 4, List.of(5, 5, 5, 5, 4, 5, 5)));
        students.add(new Student("Константин", "Б-213", 1, List.of(2, 3, 2, 4, 3, 2, 3)));
        students.add(new Student("Светлана", "Б-214", 2, List.of(5, 5, 5, 5, 5, 5, 5)));
        students.add(new Student("Роман", "Б-215", 3, List.of(2, 4, 3, 3, 4, 2, 3)));
        students.add(new Student("Ксения", "Б-216", 4, List.of(4, 3, 4, 4, 5, 4, 4)));

        selectStudents(students);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите номер курса(1-4): ");
                int courseNumber = Integer.parseInt(scanner.nextLine());
                if (1 <= courseNumber && courseNumber <= 4) {
                    printStudents(students, courseNumber);
                    break;
                } else {
                    System.out.println("Пожалуйста, введите число от 1 до 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число от 1 до 4");
            }
        }
        scanner.close();
    }

    public static void selectStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageGrade() < 3) {
                iterator.remove();
            } else {
                student.course += 1;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}
