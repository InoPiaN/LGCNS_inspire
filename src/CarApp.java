import lgcns.Car;
public class CarApp {
    
    public static void main(String[] args) {
        /*
        Quiz)
        - 여러분의 드림카를 만들어보세요
        - Car 객체생성 후 maker, model, price 접근하여 드림카를 만들고
        - 인스턴스 소유의 메서드를 호출해 본다면?
        */
        Car car = new Car();
        car.setMaker("GENISIS");
        car.setModel("G80");
        car.setPrice(80000000);

        String carInfo = car.dreamCarInfo();
        System.out.println(carInfo);


        car.drive();
        String repaireInfo = car.repaire();
        System.out.println(repaireInfo);
        car.performence("고급휘발유");
        String speedInfo = car.speed(200);
        System.out.println(speedInfo);
        
    }
}


