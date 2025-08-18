// 2025.08.07 백앤드

import lgcns.Student;
public class StudentApp {
    public static void main(String[] args) {
        
        Student instance = new Student();
        System.out.println("[debug] >>>" +instance);
        System.out.println("[debug] >>>" +instance.name);
        System.out.println("[debug] >>>" +instance.gender);
        instance.name = "이현진";
        instance.gender = 'M';

        System.out.println("[debug] >>>" +instance.name);
        System.out.println("[debug] >>>" +instance.gender);

        instance.stuInfo();
    
    }
}
