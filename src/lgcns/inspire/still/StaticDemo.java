package lgcns.inspire.still;

public class StaticDemo {
    /*
     static keyword(변수, 메서드, 내부 클래스) 
     - 인스턴스 소유가 아닌 클래스 소유
     final keyword (변수, 메서드, 클래스)
     - 변수 : 상수
    */

    public int nonStaticVar;
    public static int staticVar;

    // 상수
    public static final int CONSTVAR = 10;

    // 인스턴스 메서드
    public void nonStaticMethod() {
        System.out.println(">>> nonStaticMethod");
        nonStaticVar = 10;
        staticVar = 10;
        int sum = nonStaticVar + staticVar;
        System.out.println(">>> sum : " + sum);
    }

    // static 메서드
    public static void staticMethod() {
        System.out.println(">>> staticMethod");
        staticVar = 10;
        int sum = staticVar + staticVar;
        System.out.println(">>> sum : " + sum);
    }
}
