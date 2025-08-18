import lgcns.inspire.operator.Operator;

public class OperatorApp {

    public static void main(String[] args) {
        Operator app = new Operator();
        app.example01();
        String returnVal = app.example02( "A", "B");
        System.out.println(returnVal);
    }
    
}
