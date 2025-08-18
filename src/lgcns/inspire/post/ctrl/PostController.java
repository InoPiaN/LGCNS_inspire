package lgcns.inspire.post.ctrl;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.domain.dto.PostResponseDTO;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;

public class PostController {

    private PostService service;

    public PostController() {
        service = new PostServiceImpl();
    }

    public List<PostResponseDTO> list() {
        System.out.println(">>>> post ctrl list");
        return service.selectService();
    }

    public Optional<PostResponseDTO> findPost(int id) {
        System.out.println(">>>> post ctrl findPost : params " + id);
        return service.selectSerivce(id);
    }

    public int insert(String title, String content, String writer) {
        System.out.println(">>>> post ctrl insert : params " + title);
        System.out.println(">>>> post ctrl insert : params " + content);
        System.out.println(">>>> post ctrl insert : params " + writer);

        PostRequestDTO request = PostRequestDTO.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .id(service.selectService().size() + 1)
                .build();
        return service.insertService(request);

    }

}
