package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@ToString

public class TeacherDTO  extends PersonDTO{
       
        private String subject ;

        public String teaInfo() {
            return super.perInfo()+",subject="+subject;
        }
        @Override                       //Override - 모두 동일하고 구현부만 다름
        public String perInfo() {
            return super.perInfo()+",subject="+subject;       // super : 부모를 지칭
        }

       
     }
    

