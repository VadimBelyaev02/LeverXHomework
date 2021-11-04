package com.google.withDifferentClasses;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Program program = new Program();
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        Integer experience = scanner.nextInt();
        Float purposefulness = scanner.nextFloat();
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        Student student = new Student(name, experience, purposefulness);
        System.out.println(program.calculateRank(student));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous");
            }
        });
        thread.start();

        class Test4 {
            int a;

            public Test4(int a) {
                this.a = a;
            }
        }
    }

    public String calculateRank(Student student) {
        float rank = (float) (student.getExperience()) * student.getPurposefulness();
        String result = student.getName() + " is ";
        if (rank > 36L) {
            result += "senior:)";
        } else if (rank > 18L) {
            result += "middle:|";
        } else {
            result += "junior:(";
        }


        return result;
    }

    public class Test {
        int a;

        public Test(int a) {
            this.a = a;
        }
    }

    public static class Test3 {
        int a;

        public Test3(int a) {
            this.a = a;
        }
    }


}

class Test2 {

}

