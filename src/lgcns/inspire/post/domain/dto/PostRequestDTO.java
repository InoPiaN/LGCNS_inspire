package lgcns.inspire.post.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class PostRequestDTO {
    private int id ; 
    private String title, content, writer ;

    // 정적 팩토리 메서드 패턴
    public static PostResponseDTO toResponseDTO(PostRequestDTO request) {
        return PostResponseDTO.builder()
                    .id(request.getId())
                    .title(request.getTitle())
                    .content(request.getContent())
                    .writer(request.getWriter())
                    .build() ;
    }
}
