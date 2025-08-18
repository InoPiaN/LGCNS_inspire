import lgcns.inspire.loop.LoopDemo;

public class LoopApp {

    public static void main(String[] args) {
        LoopDemo app = new LoopDemo() ;
        int sum = app.sumOneToTen(100,200) ;
        System.out.println("sum = "+sum);  

        app.sumRandom(); 

        System.out.println();
        app.loopBreakWhile(100);

        System.out.println();
        app.popStr("jslim") ; 
        
        System.out.println();
        System.out.println();
        app.gugudanTable(); 
        
    }

}
