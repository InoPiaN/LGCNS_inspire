package lgcns.inspire.post.ctrl;

import lgcns.inspire.post.service.PostService;

public class PostSaveCtrl {
    private PostService service;

    public PostSaveCtrl() {

    }

    public PostSaveCtrl(PostService service) {
        this.service = service;

    }

    public boolean save() {
        System.out.println(">>>> post save ctrl save");

        return service.saveToFile();
    }

}
