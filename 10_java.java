package c;

import java.util.*;

public class Abc {
    public static void main(String[] args) {
        Mca s1 = new Mca();
        Msc s2 = new Msc();
        Msc s3 = new Msc();
        Mca s4 = new Mca();


        float[] grades1 = {(float) 9.1, (float) 9.7, (float) 9.7, (float) 9.4, (float) 9.2, (float) 9.9,};

        s1.read_data("Ram", "MCA", 1, grades1, 9.7f, 9.8f);
        s1.display_data();
        System.out.println("CGPA : "+s1.calculateCGPA());


        System.out.println("\n");

        float[] grades2 = {(float) 9.2, (float) 9.7, (float) 9.1, (float) 9.5, (float) 9.2, (float) 9.9,};

        s2.read_data("Sam", "MSC", 1, grades2, 9.7f, 9.8f);
        s2.display_data();
        System.out.println("CGPA : "+s2.calculateCGPA());

        System.out.println("\n");

        float[] grades3 = {(float) 9.4, (float) 9, (float) 9.1, (float) 9.8, (float) 9.2, (float) 9.4,};

        s3.read_data("Jadu", "MSC", 2, grades2, 9.7f, 9.8f);
        s3.display_data();
        System.out.println("CGPA : "+s3.calculateCGPA());

        System.out.println("\n");

        float[] grades4 = {(float) 9, (float) 9, (float) 8.1, (float) 7.8, (float) 9.2, (float) 9.4,};

        s4.read_data("Madhu", "MCA", 2, grades2, 9.7f, 9.8f);
        s4.display_data();
        System.out.println("CGPA : "+s4.calculateCGPA());

        System.out.println("\n");

        if(s1.calculateCGPA()>s4.calculateCGPA())
        {
            System.out.println("Roll: "+s1.studentRoll+" is MCA Topper");
        }
        else
        {
            System.out.println("Roll: "+s4.studentRoll+" is MCA Topper");
        }

        if(s2.calculateCGPA()>s3.calculateCGPA())
        {
            System.out.println("Roll: "+s2.studentRoll+" is MSC Topper");
        }
        else
        {
            System.out.println("Roll: "+s3.studentRoll+" is MSC Topper");
        }
    }
}

abstract class Student {
    //Student Name, Student Course, Student Roll, Grades for Sem1 to Sem6
    public String studentName, studentCourse;
    int studentRoll;
    float grades[] = new float[5];
}

class Mca extends Student {
    float cgpa=0;
    //Industrial Training Marks and Term Paper Marks respectively.
    private float itm, tpmr;

    //Create two pure virtual functions read_data() & display_data() for accepting data and display all records.
    public void read_data(String studentName, String studentCourse, int studentRoll, float[] grades, float itm, float tpmr) {
        super.studentName = studentName;
        super.studentCourse = studentCourse;
        super.studentRoll = studentRoll;
        super.grades = grades;
        this.itm = itm;
        this.tpmr = tpmr;
    }

    public void display_data() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Course : " + studentCourse);
        System.out.println("Student Roll : " + studentRoll);
        System.out.println("Grades");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            cgpa=cgpa+grades[i];
        }
        System.out.println("Student Industrial Training Marks : " + itm);
        System.out.println("Term Paper Marks : " + tpmr);
    }

    public float calculateCGPA()
    {
        float finalCGPA=cgpa/6;
        return finalCGPA;
    }

}

class Msc extends Student {
    float cgpa=0;
    //Industrial Training Marks and Term Paper Marks respectively.
    private float itm, tpmr;

    //Create two pure virtual functions read_data() & display_data() for accepting data and display all records.
    public void read_data(String studentName, String studentCourse, int studentRoll, float[] grades, float itm, float tpmr) {
        super.studentName = studentName;
        super.studentCourse = studentCourse;
        super.studentRoll = studentRoll;
        super.grades = grades;
        this.itm = itm;
        this.tpmr = tpmr;
    }

    public void display_data() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Course : " + studentCourse);
        System.out.println("Student Roll : " + studentRoll);
        System.out.println("Grades");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            cgpa=cgpa+grades[i];
        }
        System.out.println("Student Industrial Training Marks : " + itm);
        System.out.println("Term Paper Marks : " + tpmr);
    }

    public float calculateCGPA()
    {
        float finalCGPA=cgpa/6;
        return finalCGPA;
    }
}
