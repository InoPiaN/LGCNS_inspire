package lgcns.inspire.post.ctrl;

import lgcns.inspire.post.domain.dto.PostRequestDTO;
import lgcns.inspire.post.service.PostService;

public class PostInsertCtrl {

    private PostService service;

    public PostInsertCtrl() {

    }

    public PostInsertCtrl(PostService service) {
        this.service = service;

    }

    public int insert(String title, String content, String writer) {
        System.out.println(">>>>> post insert ctrl insert params title : " + title);
        System.out.println(">>>>> post insert ctrl insert params content : " + content);
        System.out.println(">>>>> post insert ctrl insert params writer : " + writer);

        PostRequestDTO request = PostRequestDTO.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .id(service.selectService().size() + 1)
                .build();
        return service.insertService(request);
    }
}
