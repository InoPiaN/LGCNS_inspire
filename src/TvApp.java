
import lgcns.inspire.abstraction.inter.TV;
import lgcns.inspire.factory.BeanFactory;

public class TvApp {

    public static void main(String[] args) {

        // SamsungTV tv = new SamsungTV();
        // tv.turnOn();

        // LgTV tv = new LgTV();
        // tv.powerOn();

        // TV tv = new LgTV();
        // tv.powerOn();

        // Singleton : 인스턴스를 하나만 유지
        // BeanFactory factory01 = BeanFactory.getInstance();
        // BeanFactory factory02 = BeanFactory.getInstance();

        // System.out.println(factory01);
        // System.out.println(factory02);

        // 표준화 작없을 통해 brand 노출 x
        BeanFactory factory = BeanFactory.getInstance();
        TV tv = factory.getBrand("samsung");
        tv.powerOn();

    }
}
