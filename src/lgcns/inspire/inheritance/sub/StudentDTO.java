package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString

public class StudentDTO extends PersonDTO {
    ////////////  공통의 요소
    // private String  name;
    // private int     age;
    // private String  address;

    private String stuId;

    public String stuInfo(){
        return super.perInfo()+",stuId="+stuId;
    }
    @Override                       //Override - 모두 동일하고 구현부만 다름
    public String perInfo() {
        return super.perInfo()+",stuId="+stuId;
    }
    
}
