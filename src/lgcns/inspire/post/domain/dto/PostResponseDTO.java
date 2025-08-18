package lgcns.inspire.post.domain.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class PostResponseDTO {

    private int             id ; // 해당 게시글을 식별할 수 있는 기본키(primary key)
    private String          title ; 
    private String          content ;
    private String          writer ; 
    private LocalDateTime   regDate ; 
    private int             viewCnt ;    
}

