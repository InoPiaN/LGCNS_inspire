package lgcns.inspire.inheritance.service;


import lgcns.inspire.inheritance.PersonDTO;
import lgcns.inspire.inheritance.util.Division;

public interface OopService {
                        // setter 반환 타입 x / getter 반환 타입 o
    public void         setMakePer(Division division, String name, int age, String address, String comm) ;
    public PersonDTO    getFindPer(String name) ;
    public PersonDTO [] getAryPer() ;           // PersonDTo의 배열 반환


    // public void         setPer(PersonDTO per) ;

}