package lgcns.inspire.post.ctrl;

import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class PostFindCtrl {
    public Optional<PostResponseDTO> findPost(int id) {
        System.out.println(">>>> post ctrl findPost : params" + id);
        return null;
    }
}
