package lgcns.inspire.post.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        // 데이터베이스 연동 후 값을 가져온다고 가정하고 더미데이터를 생성
        return posts;

    }
    // public PostResponseDTO selectRow(String id) {
    // System.out.println(">>>> dao selectRow id");
    // // R(조건에 만족하는 검색)
    // // SQL : select * from table where id = ? ;
    // return null ;
    // }

    // U(수정)
    public int updateRow(PostRequestDTO request) {
        System.out.println(">>>> dao updateRow");
        return 0;
    }

    // D(삭제)
    public int deleteRow(String id) {
        System.out.println(">>>> dao deleteRow id");
        return 0;
    }

}
