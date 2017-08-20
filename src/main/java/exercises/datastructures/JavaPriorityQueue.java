package exercises.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

import static java.lang.String.format;
import static java.util.Comparator.comparingDouble;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final Priorities priorities = new Priorities();

    public void solve() {
        // Given Code
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

    private class Priorities {
        List<Student> getStudents(List<String> events) {

            PriorityQueue<Student> queue = new PriorityQueue<>(
                    comparingDouble(Student::getCgpa)
                            .reversed()
                            .thenComparing(Student::getName)
                            .thenComparingInt(Student::getId)
            );

            events.stream().forEach(event -> {
                String[] strings = event.split(" ");

                if (strings[0].equals("SERVED") && !queue.isEmpty()) {
                    queue.poll();
                } else if (strings[0].equals("ENTER")) {
                    queue.add(new Student(
                            Integer.parseInt(strings[3]),
                            strings[1],
                            Double.parseDouble(strings[2])));
                }
            });

            ArrayList<Student> result = new ArrayList<>();
            while (!queue.isEmpty()) {
                result.add(queue.poll());
            }

            return result;
        }
    }

    private class Student {
        private int id;
        private String name;
        private double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        String getName() {
            return name;
        }

        int getId() {
            return id;
        }

        double getCgpa() {
            return cgpa;
        }

        @Override
        public String toString() {
            return format("%s %s %s", name, cgpa, id);
        }
    }
}
