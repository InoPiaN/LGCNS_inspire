import lgcns.Teacher;

public class TeacherApp {
    public static void main(String[] args) {
        
        Teacher tea01 = new Teacher();
        System.out.println(tea01.name);
        System.out.println(tea01.height);
        System.out.println(tea01.age);
        System.out.println(tea01.mbti);
        System.out.println(tea01.birthPlace);
        System.out.println(tea01.isMarriage);
        ////
        Teacher tea02 = new Teacher("hyunjin", 178, 24, "esfj", "서울", true) ;
        System.out.println(tea02.name);
        System.out.println(tea02.height);
        System.out.println(tea02.age);
        System.out.println(tea02.mbti);
        System.out.println(tea02.birthPlace);
        System.out.println(tea02.isMarriage);

            }
    
}

