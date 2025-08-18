public class StringApp {

    public static void main(String[] args) {

       // String str01 = "inspire", str02 = "inspire";
       // 객체 생성 코드로 String 사용
       String str01 = new String("jslim");
       String str02 = new String("jslim");

        if( str01 == str02 ){
            System.out.println("str01 == str02 ");
        }else{
            System.out.println("str01 !== str02 ");
        }

        if( str01.equals(str02 )){
            System.out.println("str01.equals(str02 ) ");
        }else{
            System.out.println("!str01.equals(str02 ) ");
        }
    }
    
}
