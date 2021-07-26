package HomeWork.Test01;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {

        ArrayList<Student> studentlist = new ArrayList();
        Student student1 = new Student("小明","男",18);
        Student student2 = new Student("小王","男",19);
        Student student3 = new Student("小刘","男",25);

        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);

        System.out.println("学生集合遍历结果:");
        for (Object stu : studentlist) {
            System.out.println(stu);
        }

        Student maxage = studentlist.get(0);

        for (int i = 0; i < studentlist.size(); i++) {
            int age = studentlist.get(i).getAge();
            if (maxage.getAge()<age){
                maxage = studentlist.get(i);
            }
        }
        maxage.setName("小猪佩奇");
        System.out.println("改完名之后遍历的结果为：");
        for (Object stu : studentlist) {
            System.out.println(stu);
        }

    }
}
