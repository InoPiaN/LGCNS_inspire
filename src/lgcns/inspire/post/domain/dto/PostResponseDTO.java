package lgcns.inspire.post.domain.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lgcns.inspire.post.service.PostService;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class PostResponseDTO implements Serializable {

    private int id; // 해당 게시글을 식별할 수 있는 기본키(primary key)
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;
    private int viewCnt;
}
