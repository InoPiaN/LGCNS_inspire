package lgcns;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class ArgPolyApp {

    private static PersonDTO [] preAry = new PersonDTO[10] ;
    private static int idx;
    public static void main(String[] args) {
         TeacherDTO tea = TeacherDTO.builder()
                            .name("임섭순")
                            .age(20)
                            .address("서울")
                            .subject("자바")
                            .build();
        StudentDTO stu = StudentDTO.builder()
                            .name("이현진")
                            .age(24)
                            .address("서울")
                            .stuId("2025")
                            .build();
        
        setperAry(stu);
        setperAry(tea);

        printAry();
        
    }
    // 오버로딩
    public static void setperAry(PersonDTO element){
        preAry[idx++]=element;
    }
   


    public static void printAry(){
        System.out.println( " >>>>> 전체 출력");
        System.out.println();
        for(PersonDTO element : preAry){
            if( element != null){
                System.out.println(element.perInfo());

            }else{
                break;
            }
        }
    }
    
}
