package exercises.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {

    private class Student {
        private int id;
        private String fname;
        private double cgpa;

        Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public void solve() {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Custom code

        studentList.sort((o1, o2) -> {
            if (o2.getCgpa() < o1.getCgpa()) {
                return -1;
            } else if (o2.getCgpa() > o1.getCgpa()) {
                return 1;
            }

            int result = o1.getFname().compareTo(o2.getFname());

            if (result == 0) {
                if (o1.getId() < o2.getId()) {
                    return -1;
                } else if (o1.getId() > o2.getId()) {
                    return 1;
                }
            }

            return result;
        });

        // End custom code

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

}
