package lgcns;

public class Car {
    // 클래스의 구성요소
    // 인스턴스 소유 (변수 + 매서드) + 생성자(new 연산자 뒤에서만 호출)

    private String   maker, model ;
    private int      price;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String dreamCarInfo(){
        return "당신의 드림카 제조사는 : "+maker+" 이고 모델은 : "+model+" 이며 가격은 : "+price+" 입니다." ;
    }

    public void drive(){
        System.out.println("매개변수 없고 반환 타입이 없다");

    }
    public String repaire(){
        System.out.println("매개변수 없고 반환 타입이 문자열");
        return "차량이 수리되었습니다.";
    }

    public void performence(String fuel){
        System.out.println("매개변수로 문자열을 전달받고 반환타입이 없다");
        System.out.println(fuel+"로 성능이 향상 되었습니다");
    }
    public String speed(int speed){
        System.out.println("매개변수가 정수형이고 반환타입이 문자열");
        System.out.println("당신의 속도 :"+speed);
        return "과속중입니다.";
    }
}
