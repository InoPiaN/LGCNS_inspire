package lgcns.inspire.post.ctrl;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.service.PostService;

public class PostUpdateCtrl {
    private PostService service;

    public PostUpdateCtrl() {

    }

    public PostUpdateCtrl(PostService service) {
        this.service = service;

    }

    public int update(String title, String content, int id) {
        System.out.println(">>>>> post update ctrl update params title : " + title);
        System.out.println(">>>>> post update ctrl update params content : " + content);
        System.out.println(">>>>> post update ctrl update params id : " + id);
        PostRequestDTO request = PostRequestDTO.builder()
                .title(title)
                .content(content)
                .id(id)
                .build();
        return service.updateService(request);
    }
}
