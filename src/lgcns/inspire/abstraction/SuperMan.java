package lgcns.inspire.abstraction;

import lgcns.inspire.abstraction.inter.Flyer;

public class SuperMan extends Animal implements Flyer{

    @Override
    public void fly() {
        System.out.println("슈퍼맨은 망토를 이용해 날아다닙니다.");
    }

    @Override
    public void takeOff() {
        System.out.println("슈퍼맨이 이륙합니다.");
    }

    @Override
    public void landing() {
        System.out.println("슈퍼맨이 착륙합니다.");;
    }
    
}
