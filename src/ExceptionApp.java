
import lgcns.inspire.exception.ExceptionDemo;

public class ExceptionApp {

    public static void main(String[] args) {
        // ExceptionDemo app = new ExceptionDemo();
        // String [] strAry = {"jslim", "lgcns", "inspire"};
        // app.printAry(strAry);

        // Scanner scan = new Scanner(System.in);
        // System.out.print("숫자를 입력하세요:");
        // int number = 0;
        // try{
        // number = scan.nextInt();
        // } catch(Exception e){
        // System.out.println(" >>> read data :"+number);
        // }
        ExceptionDemo app = new ExceptionDemo();
        // String result = app.readConsole();
        // System.out.println(" >>> result :" +result);
        try {
            app.first(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
