package lgcns;

public class Teacher {

    public String   name;
    public double   height;
    public int      age;
    public String   mbti;
    public String   birthPlace;
    public boolean  isMarriage;
    
    /*
        생성자 : Constructor
        - like mathod
        - 반환타입 x, 매서드 이르미 클래스 이름과 동일
        - 일반 매서드 처럼 호출할 수 x, 객체 생성시 호출될 수 있음
        - 인자 없는 생성자를 '기본 생성자', 인자 있는 생성자를 '스페셜 생성자'
        - 여러개의 생성자가 인자의 개수와 타입을 달리해서 정의되는 것을 '생성자 오버로딩'
        - 역할: 맴버 변수 초기화
     */
        // 기본 생성자
     public Teacher(){
        
     }
        // 스페셜 생성자
     public Teacher(String name, double height, int age, String mbti, String birthPlace, boolean isMarriage) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.mbti = mbti;
        this.birthPlace = birthPlace;
        this.isMarriage = isMarriage;
     }
    
}
