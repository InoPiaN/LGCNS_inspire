import lgcns.inspire.still.StaticDemo;

public class StaticApp {

    public static void main(String[] args) {

            StaticDemo.staticVar = 10 ;
            System.out.println(StaticDemo.staticVar);
            StaticDemo.staticVar = 20 ;
            System.out.println(StaticDemo.staticVar);

            // error
            // StaticDemo.CONSTVAR = 20 ;

            StaticDemo app = new StaticDemo() ;
            app.nonStaticMethod();

            // static method 접근
            StaticDemo.staticMethod();
        }
}