import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;

public class CollectionApp {
    /*
        Collection API
        - List(중복허용, 순서존재, 객체를 요소로 갖는다, 가변길이)
        - Set(중복x, 순서x, 객체를 요소로 갖는다, 가변길이)
        - Map({key : value})

        Wrapper Class(Boxing)
        - int -> Integer, char -> Character
     */
    public static void main(String[] args) {
        System.out.println(">>> Array");
        int [] ary = new int[5];
        ary[0] = 10; ary[1] = 20; ary[2] = 30; ary[3] = 40; ary[4] = 50;
        // ary[5] = 60;
        System.out.println(">>> length :" +ary.length);
        ary[2] = 0;
        System.out.println( Arrays.toString(ary));  // static 문법 : 클래스 이름으로 매서드에 접근

        System.out.println();
        System.out.println(" >>> List");

        // add() get() set() remove()
        List<Integer> list = new ArrayList<Integer>(); // <>안에 타입 지정
        list.add(10);
        list.add(20);
        list.add(10);
        System.out.println( list.toString());
        for(int idx=0; idx < list.size(); idx++){
            int data = list.get(idx);
            System.out.println(data);
        }
        ////////////////////////////////////////////
        
        List<PersonDTO> perlist = new ArrayList<PersonDTO>();
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
        perlist.add(tea);
        perlist.add(stu);
        for(int idx=0; idx < perlist.size(); idx++){
            System.out.println(perlist.get(idx).perInfo());

        }
        System.out.println();
        System.out.println(" >>> Set");
        Set<String> set = new HashSet<>();
        set.add("jslim"); set.add("inspire"); set.add("lgcns"); 
        set.add("jslim");
        System.out.println(set); 

        Object[] setAry = set.toArray();
        for(Object value : setAry){
            System.out.println(value);
        }
        System.out.println();
        System.out.println( ">>> Map");

        Map<String, List<? extends PersonDTO>> map = new HashMap<>();

        List<StudentDTO> stulist = new ArrayList<>();
        stulist.add(stu); 

        List<TeacherDTO> tealist = new ArrayList<>();
        tealist.add(tea); 

        map.put ("stu" , stulist);
        map.put ("tea" , tealist);

        List<? extends PersonDTO> PerStulist = map.get("stu");
        for(PersonDTO per : PerStulist){
            System.out.println(per.perInfo());
        }
        List<? extends PersonDTO> PerTealist = map.get("tea");
        for(PersonDTO per : PerTealist){
            System.out.println(per.perInfo());
        }
        
    }
}
