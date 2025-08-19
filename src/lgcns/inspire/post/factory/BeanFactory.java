package lgcns.inspire.post.factory;

import java.util.HashMap;
import java.util.Map;

import lgcns.inspire.post.ctrl.PostFindCtrl;
import lgcns.inspire.post.ctrl.PostInsertCtrl;
import lgcns.inspire.post.ctrl.PostListCtrl;
import lgcns.inspire.post.ctrl.PostSaveCtrl;
import lgcns.inspire.post.ctrl.PostSearchCtrl;
import lgcns.inspire.post.ctrl.PostUpdateCtrl;
import lgcns.inspire.post.service.PostService;
import lgcns.inspire.post.service.PostServiceImpl;
import lgcns.inspire.post.ctrl.PostDeleteCtrl;

/*
    Singleton Patton
    - 인스턴스를 하나로 유지하는 방법 (무 분별한 객체 생성을 방지) : Invwesion Of Control(IOC)
    - 문법
        - 생성자의 접근제어자를 privite
        -  자신의 타입을 반환하는 메서드를 static
 */
public class BeanFactory {
    private static BeanFactory instance;
    private Map<String, Object> map; // ** object : 모든 클래스는 object를 상속 가능, 다형성 지향
    private PostService service;

    private BeanFactory() { // map은 인터페이스
        service = new PostServiceImpl();
        map = new HashMap<>();
        map.put("list", new PostListCtrl(service));
        map.put("find", new PostFindCtrl(service));
        map.put("insert", new PostInsertCtrl(service));
        map.put("update", new PostUpdateCtrl(service));
        map.put("delete", new PostDeleteCtrl(service));
        map.put("search", new PostSearchCtrl(service));
        map.put("save", new PostSaveCtrl(service));

    }

    public static BeanFactory getInstance() {
        if (instance == null) {
            instance = new BeanFactory();
        }
        return instance;
    }

    public Object getCtrl(String requestURL) {
        return map.get(requestURL);
    }

}
