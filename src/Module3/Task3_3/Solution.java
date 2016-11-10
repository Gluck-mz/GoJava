package Module3.Task3_3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course java = new Course(new Date(2015, 4, 15), "Java");
        Course chemistry = new Course("Chemistry", 80, "Mendeleev");
        Course qa = new Course(new Date(2016, 8, 4), "QA");
        Course math = new Course("Math", 120, "Newton");
        Course phisics = new Course(new Date(2004, 10, 1), "Phisics");
        Student student0 = new Student("Ivan", "Ivanov", 4);
        Student student1 = new Student("Petrov", new Course[]{java});
        CollegeStudent collegeStudent0 = new CollegeStudent("Petro", "Petrov", 2);
        CollegeStudent collegeStudent1 = new CollegeStudent("Metelkina", new Course[]{chemistry});
        CollegeStudent collegeStudent2 = new CollegeStudent("Sveta", "Svetlaya", 7, new Course[]{qa}, 28, "GoIT", 70, 110101110);
        SpecialStudent specialStudent0 = new SpecialStudent("Vin", "Diesel", 1);
        SpecialStudent specialStudent1 = new SpecialStudent("Joda", new Course[]{phisics, math});
        SpecialStudent specialStudent2 = new SpecialStudent("Isaak", "Newton", 3, new Course[]{math, phisics, chemistry}, 40, "Harvard", 100, 101010, 171778);
    }
}
