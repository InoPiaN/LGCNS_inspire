package lgcns.inspire.inheritance.service;

import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.sub.StudentDTO;
import lgcns.inspire.inheritance.sub.TeacherDTO;
import lgcns.inspire.inheritance.util.Division;

/*
    xxxServiceImpl 이란? 비즈니스 로직을 담담하는 객체
    - Tea, Stu 인스턴스 생성 및 배열 관리하는 역할
    - 프런트 쪽 데이터 전달(배열)
    - 프런트 쪽 찾기 요청 ( 객체)
 */

public class OopServiceImpl implements OopService {

    private PersonDTO[] ary;
    private int idx;

    public OopServiceImpl() {
        ary = new PersonDTO[10];
    }

    @Override
    public void setMakePer(Division division, String name, int age, String address, String comm) {
        switch (division.getDivision()) {
            case "학생":
                StudentDTO stu = StudentDTO.builder()
                        .name(name)
                        .age(age)
                        .address(address)
                        .stuId(comm)
                        .build();
                setPer(stu);
                break;
            case "강사":
                TeacherDTO tea = TeacherDTO.builder()
                        .name(name)
                        .age(age)
                        .address(address)
                        .subject(comm)
                        .build();
                setPer(tea);
                break;
        }
        ;
    }

    @Override
    public PersonDTO getFindPer(String name) {
        for (PersonDTO data : ary) {
            if (data != null && data.getName().equals(name)) {
                return data;
            }
        }
        return null;
    }

    @Override
    public PersonDTO[] getAryPer() {
        return ary;
    }

    private void setPer(PersonDTO per) {
        ary[idx++] = per;
    }

}
