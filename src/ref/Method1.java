package ref;

import ref.Student;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 50;

        printStudent(student1);
        System.out.println();

        Student student3 = new Student();
        initStudent(student3, "학생3", 20, 100);
        printStudent(student3);
    }

    static void printStudent(Student student) {
        System.out.println("name : " + student.name + ", age : " + student.age
                        + ", grade : " + student.grade);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
