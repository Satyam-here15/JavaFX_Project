public class Student {
    private String name;
    private int rollNo;
    private double marks;
    private String grade;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }
    public String getGrade() { return grade; }
}

