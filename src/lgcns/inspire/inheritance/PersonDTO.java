package lgcns.inspire.inheritance;

import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.ToString;

@SuperBuilder
@Getter
@ToString

public class PersonDTO {
    //////////// 공통의 요소
    private String name;
    private int age;
    private String address;

    public String perInfo() {
        return "PersonDTO name=" + name + ", age=" + age + ", address=" + address;
    }

}
