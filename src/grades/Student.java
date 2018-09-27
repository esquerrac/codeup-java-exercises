package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public String getName() {
        return name;
    }
    public void addGrade (int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double totalGrade = 0;
        double averageGrade = 0;
        int gradeSize = this.grades.size();
        for (int i=0; i<gradeSize; i++){
            double currentGrade = this.grades.get(i);
            totalGrade+=currentGrade;
        }
         averageGrade = totalGrade/gradeSize;
        return averageGrade;
    }

    public static void main(String[] args) {
//        Student test1 = new Student("One");
//        Student test2 = new Student("Two");
//        Student test3 = new Student("Three");
//        test1.grades.add(80);
//        test1.grades.add(90);
//        test1.grades.add(100);
//        test1.grades.add(90);
//        System.out.println(test1.getGradeAverage());
//        test2.grades.add(80);
//        test2.grades.add(70);
//        test2.grades.add(70);
//        test2.grades.add(60);
//        System.out.println(test2.getGradeAverage());
//        test3.grades.add(100);
//        test3.grades.add(50);
//        test3.grades.add(50);
//        test3.grades.add(100);
//        System.out.println(test3.getGradeAverage());

    }
}
