package lgcns.inspire.post.repository;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

/*
DAO(Data Access Object) 
- db 와의 작업을 담당하는 클래스 
- 입력(C), 읽기(R), 수정(U), 삭제(D) : CRUD 
- Structure Query Language (SQL) : DDL, DML, DCL, Select Query 


*/
public class PostDAO {

    private List<PostResponseDTO> posts;

    public PostDAO() {
        // 파일 입출력을 위해서 데이터 저장 및 로드를 위해
        posts = new ArrayList<PostResponseDTO>();

        // 파일 입력
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:\\inspire\\be\\inspire-java\\test.txt"))) {
            posts.clear();
            posts = (List<PostResponseDTO>) ois.readObject();
            posts.stream()
                    .forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 초기 데이터 생성
        posts = new ArrayList<>(Arrays.asList(
                PostResponseDTO.builder()
                        .id(1)
                        .title("mvc")
                        .content("springboot")
                        .writer("jslim").build(),
                PostResponseDTO.builder()
                        .id(2)
                        .title("stream api")
                        .content("기초문법")
                        .writer("lgcns").build(),
                PostResponseDTO.builder()
                        .id(3)
                        .title("lambda")
                        .content("함수형 인터페이스와 연동")
                        .writer("lgcns").build(),
                PostResponseDTO.builder()
                        .id(4)
                        .title("springboot")
                        .content("pattern 조합")
                        .writer("inspire").build()));
    }

    // C(입력)
    public int insertRow(PostRequestDTO request) {
        System.out.println(">>>> dao insertRow");
        int flag = 1;
        posts.add(PostRequestDTO.toResponseDTO(request));
        return flag;
    }

    // R(전체 검색)
    public List<PostResponseDTO> selectRow() {
        System.out.println(">>>> dao selectRow");
        return posts;

    }
    // public PostResponseDTO selectRow(String id) {
    // System.out.println(">>>> dao selectRow id");
    // // R(조건에 만족하는 검색)
    // // SQL : select * from table where id = ? ;
    // return null ;
    // }

    // U(수정)
    // Stream peek() : 원본리스트 안의 객체 속성을 변경할 수 있다.
    public int updateRow(PostRequestDTO request) {
        System.out.println(">>>> dao updateRow");

        // for (int idx = 0; idx < posts.size(); idx++) {
        // PostResponseDTO post = posts.get(idx);
        // if (post.getId() == request.getId()) {
        // post.setTitle(request.getTitle());
        // post.setContent(request.getContent());
        // }
        // }

        // Optional<PostResponseDTO> response = posts.stream()
        // .filter(post -> post.getId() == request.getId())
        // .findFirst();
        // if(request.isPresent())
        // {psot.setTitle(request.getTitle());
        // post.setContent(request.getContent());
        // });

        boolean flag = posts.stream()
                .filter(post -> post.getId() == request.getId())
                .peek(post -> {
                    post.setTitle(request.getTitle());
                    post.setContent(request.getContent());
                })
                .anyMatch(post -> true);

        return (flag) ? 1 : 0;
    }

    // D(삭제)
    public int deleteRow(Map<String, Integer> map) {
        System.out.println(">>>> dao deleteRow id" + map.get("key"));

        // delete from table where id = ? (SQL)
        boolean flag = posts.removeIf(post -> post.getId() == map.get("key"));

        return (flag) ? 1 : 0;
    }

}
