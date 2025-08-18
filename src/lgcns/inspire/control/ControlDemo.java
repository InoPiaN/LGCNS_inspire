package lgcns.inspire.control;

public class ControlDemo {
    /*
     * 제어구문 : A 또는 B 의 행위를 기대할 수 있는 것
     * if(조건식) {
     * 조건에 대한 값이 true 일 때 수행하는 블럭
     * 중첩될 수 있다.
     * if(조건식) {
     * 
     * } else {
     * 
     * }
     * } else if(조건식) {
     * 조건에 대한 값이 false 일 때 수행하는 블럭
     * if(조건식) {
     * 
     * } else {
     * 
     * }
     * } else {
     * 
     * }
     * 
     * // char, int, String, enum
     * switch(값) {
     * case 값 :
     * 수행
     * break ;
     * default :
     * 수행
     * }
     * 
     * (조건식) ? true 일 때 : false 일 때
     */

    /*
     * 조건) 매개변수의 값이 1 ~ 3
     * 조건) 1 : 금도끼 , 2 : 은도끼 , 3 : 쇠도끼
     * 조건) 나무꾼이 제 도끼는 1번입니다라고 한다면? -> '거짓말을 하는구나' 메시지를 반환
     * 조건) 나무꾼이 제 도끼는 2번입니다라고 한다면? -> '또 거짓말을 하는구나' 메시지를 반환
     * 조건) 나무꾼이 제 도끼는 3번입니다라고 한다면? -> '정직하구나 너에게 모든 도기를 주겠다' 메시지를 반환
     */
    public String woodMan(int number) {
        String result = null;
        if (number >= 1 && number <= 3) {
            System.out.println("산신령이 나타나서 묻는데 네 도끼는 몇번이냐?");
            if (number == 1) {
                System.out.println("나무꾼이 대답하길 제 도끼는 1번입니다.");
                result = "거짓말을 하는구나";
            } else if (number == 2) {
                System.out.println("나무꾼이 대답하길 제 도끼는 2번입니다.");
                result = "또 거짓말을 하는구나";
            } else {
                System.out.println("나무꾼이 대답하길 제 도끼는 3번입니다.");
                result = "정직하구나 너에게 모든 도기를 주겠다";
            }
        } else {
            result = "정확한 숫자를 입력하세요(1 ~ 3)";
        }
        return result;
    }

    public String woodManSwitch(int number) {
        String result = null;
        if (number >= 1 && number <= 3) {
            System.out.println("산신령이 나타나서 묻는데 네 도끼는 몇번이냐?");

            switch (number) {
                case 1:
                    System.out.println("나무꾼이 대답하길 제 도끼는 1번입니다.");
                    result = "거짓말을 하는구나";
                    break;
                case 2:
                    System.out.println("나무꾼이 대답하길 제 도끼는 2번입니다.");
                    result = "또 거짓말을 하는구나";
                    break;
                case 3:
                    System.out.println("나무꾼이 대답하길 제 도끼는 3번입니다.");
                    result = "정직하구나 너에게 모든 도기를 주겠다";
                    break;
                default:
                    break;
            }
        } else {
            result = "정확한 숫자를 입력하세요(1 ~ 3)";
        }
        return result;
    }

    public String woodManTernary(int number) {
        String result = null;
        if (number >= 1 && number <= 3) {
            System.out.println("산신령이 나타나서 묻는데 네 도끼는 몇번이냐?");

            result = (number == 1) ? "거짓말을 하는구나"
                    : (number == 2) ? "또 거짓말을 하는구나"
                            : "정직하구나 너에게 모든 도기를 주겠다";

            System.out.println("산신령이 연못으로 사라졌다.");
        } else {
            result = "정확한 숫자를 입력하세요(1 ~ 3)";
        }
        return result;
    }

    /*
     * Quiz)
     * paramter : kor, eng, math
     * return type : String
     * method name : passOrNonPass
     * 합격의 조건)
     * - 세 과목의 점수가 각각 40점이상이면서(&&)
     * - 평균 60점 이상이면 합격
     * - 아니면 불합격
     */
    public String passOrNonPass(int kor, int eng, int math) {

        double avg = (kor + eng + math) / 3;
        return (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";

    }

}
