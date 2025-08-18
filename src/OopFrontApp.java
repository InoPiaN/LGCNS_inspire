import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.service.OopService;
import lgcns.inspire.inheritance.service.OopServiceImpl;
import lgcns.inspire.inheritance.util.Division;

public class OopFrontApp {

    public static void main(String[] args) {
        
        OopService service = new OopServiceImpl();
        System.out.println(">>> 객체 생성을 요구");
        service.setMakePer(Division.STU, "이현진", 24, "동작구", "2025");
        service.setMakePer(Division.TEA, "임정섭", 20, "송파구", "자바");

        System.out.println();
        System.out.println(">>> 전체 출력 ");
        PersonDTO []ary = service.getAryPer();
        for(PersonDTO data : ary){
            if(data == null){
                break;
            }
            System.out.println( data.perInfo());
        }
        System.out.println();
        System.out.println(">>> 찾기");

        PersonDTO findObj = service.getFindPer("임정섭");
        if(findObj == null){
            System.out.println(">>> 데이터 찾기 실패");
        }else{
            System.out.println(findObj.perInfo());
        }
    }
    
}
