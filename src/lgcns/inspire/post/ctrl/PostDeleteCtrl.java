package lgcns.inspire.post.ctrl;

import java.util.HashMap;
import java.util.Map;

import lgcns.inspire.post.service.PostService;

public class PostDeleteCtrl {

    private PostService service;

    public PostDeleteCtrl() {

    }

    public PostDeleteCtrl(PostService service) {
        this.service = service;
    }

    public int delete(int id) {
        System.out.println(">>>>> post delete ctrl delete params id : " + id);
        Map<String, Integer> map = new HashMap<>();
        map.put("key", id);
        return service.deleteService(map);
    }
}
