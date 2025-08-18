package lgcns.inspire.operator;

public class Operator {

    // 객체 생성시 맴버 변수의 초기화를 도와주는 like a method
    public  Operator(){

    }

    // 반환값 x, 매개변수x
    public void example01(){
        System.out.println(">>> 산술연산자 +, -, *, /, %");
        System.out.println(">>> 증감연산자 ++, --");
        System.out.println(">>> 삼항연산자(조건식) ? true : false");
        System.out.println(">>> 논리연산자 &, |, !, &&, ||");
        System.out.println(">>> 관계연산자 >, >=, <, <=, ==, != ");

    }
    // 반환값 o, 매개변수o
    public String example02(String str01, String str02){
        return str01+"\t"+str02;
    }

    
}
