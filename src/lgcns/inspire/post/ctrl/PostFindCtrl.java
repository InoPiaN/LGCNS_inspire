package lgcns.inspire.post.ctrl;

import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;

public class PostFindCtrl {

    private PostService service;

    public PostFindCtrl() {

    }

    public PostFindCtrl(PostService service) {
        this.service = service;

    }

    public Optional<PostResponseDTO> findPost(int id) {
        System.out.println(">>>> post ctrl findPost : params" + id);
        return service.selectSerivce(id);
    }
}
