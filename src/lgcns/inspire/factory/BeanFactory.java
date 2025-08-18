package lgcns.inspire.factory;
import lgcns.inspire.abstraction.LgTV;
import lgcns.inspire.abstraction.SamsungTV;
import lgcns.inspire.abstraction.inter.TV;

public class BeanFactory {

    private static BeanFactory instance;
    private TV [] ary;      // 변수 선언
    private BeanFactory(){
        ary = new TV[2];    // 변수 생성
        ary[0] = new SamsungTV() ;
        ary[1] = new LgTV();
    }
    public static BeanFactory getInstance(){
        if(instance == null){
            instance = new BeanFactory();
        }
        return instance;
    }

    public TV getBrand(String brand){
        return (brand.equals("samsung")) ? ary[0] : ary[1];
    }
}
