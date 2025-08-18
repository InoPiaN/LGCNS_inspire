
/*
 배열 (Array)
    - 고정길이를 갖는다(동적으로 리사이징 x)
    - 단일 타입만 담는 그릇 (기본, 참조)
    - 참조타임 취급
    - length 속성을 통해서 배열의 길이를 확인
    - 첨자번지는 0 ~
    - [ ]
 */
// int[]ary = new int[10] ; // 배열을 선언 했지만 담을 수 있는 타입을 int로 지정, 
// ary[0] = 'A';           // 문자는 숫자로 판단, 즉 int로 계산

import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class AryApp {

    public static void main(String[] args) {
        int[] ary = { 1, 2, 3, 4, 5 };
        System.out.println(">>> ary length :" + ary.length);

        for (int idx = 0; idx < ary.length; idx++) {
            System.out.println(ary[idx]);
        }

        System.out.println();
        System.out.println(" >>> enhanced loop");
        for (int data : ary) {
            System.out.println(data);
        }

        ////////////////////////////////////////////////////////////////
        System.out.println(" >>> 참조타입의 객체를 배열에 담는다면?");
        PostResponseDTO[] postAry = new PostResponseDTO[10];

        // Builb=der Patter 을 이용한 객체 생성 방법
        PostResponseDTO data = PostResponseDTO.builder()
                .title("빌더패턴")
                .build();
        System.out.println(">>> getter call : " + data.getTitle());
        postAry[0] = data;
        for (PostResponseDTO dto : postAry) {
            if (dto != null) {
                System.out.println(">>> title " + dto.getTitle());
            }
        }
        System.out.println(">>> main end <<<");
    }
}
