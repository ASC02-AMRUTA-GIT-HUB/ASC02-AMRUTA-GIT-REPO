package com.demo.lab1;

public class Student {
    private int studentId, marks1, marks2, marks3;
    private String studentName, city;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    // Constructor for easier initialization
    public Student(int id, String name, String city, int m1, int m2, int m3, float fee, boolean scholarship) {
        this.studentId = id;
        this.studentName = name;
        this.city = city;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.feePerMonth = fee;
        this.isEligibleForScholarship = scholarship;
    }

    // Getters
    public String getStudentName() { return studentName; }
    public float getFeePerMonth() { return feePerMonth; }
    public boolean hasScholarship() { return isEligibleForScholarship; }

    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public float getAverage() {
        return getTotalMarks() / 3.0f;
    }

    public String getResult() {
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }



    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", "New York", 75, 80, 90, 5000.0f, true),
                new Student(2, "Bob", "Los Angeles", 65, 70, 60, 4500.0f, false),
                new Student(3, "Charlie", "Chicago", 85, 88, 91, 4800.0f, true)
        };

        // Top scorer
        Student topScorer = students[0];
        Student leastFee = students[0];

        for (Student s : students) {
            if (s.getTotalMarks() > topScorer.getTotalMarks()) topScorer = s;
            if (s.getFeePerMonth() < leastFee.getFeePerMonth()) leastFee = s;
        }

        System.out.println("Top Scorer: " + topScorer.getStudentName());
        System.out.println("Least Fee Paying Student: " + leastFee.getStudentName() +
                ", Fee: " + leastFee.getFeePerMonth());

        // All student details
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.printf("Name: %s%nTotal: %d%nAverage: %.2f%nResult: %s%nScholarship: %s%n%n",
                    s.getStudentName(), s.getTotalMarks(), s.getAverage(), s.getResult(),
                    s.hasScholarship() ? "Yes" : "No");
        }
    }
}










