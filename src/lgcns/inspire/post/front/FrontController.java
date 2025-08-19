package lgcns.inspire.post.front;

import java.util.List;
import java.util.Optional;

import lgcns.inspire.post.factory.BeanFactory;
import lgcns.inspire.post.ctrl.PostDeleteCtrl;
import lgcns.inspire.post.ctrl.PostFindCtrl;
import lgcns.inspire.post.ctrl.PostInsertCtrl;
import lgcns.inspire.post.ctrl.PostListCtrl;
import lgcns.inspire.post.ctrl.PostSaveCtrl;
import lgcns.inspire.post.ctrl.PostSearchCtrl;
import lgcns.inspire.post.ctrl.PostUpdateCtrl;
import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class FrontController {

    private BeanFactory factory;

    public FrontController() {
        factory = BeanFactory.getInstance();
    }

    public List<PostResponseDTO> list(String requestURL) {
        System.out.println(">>> front ctrl data :");
        PostListCtrl obj = (PostListCtrl) factory.getCtrl(requestURL);

        return obj.list();
    }

    public Optional<PostResponseDTO> findPost(String requestURL, int id) {
        System.out.println(">>> front ctrl findPost params : " + id);

        PostFindCtrl obj = (PostFindCtrl) factory.getCtrl(requestURL);

        return obj.findPost(id);
    }

    public int insert(String requestURL, String title, String content, String writer) {
        System.out.println(">>> front ctrl findPost params : " + title);
        System.out.println(">>> front ctrl findPost params : " + content);
        System.out.println(">>> front ctrl findPost params : " + writer);

        PostInsertCtrl obj = (PostInsertCtrl) factory.getCtrl(requestURL);
        return obj.insert(title, content, writer);
    }

    public int delete(String requestURL, int id) {
        System.out.println(">>>> front ctrl delete params id :" + id);

        PostDeleteCtrl obj = (PostDeleteCtrl) factory.getCtrl(requestURL);
        return obj.delete(id);
    }

    public int update(String requestURL, String title, String content, int id) {
        System.out.println(">>> front ctrl update params : " + title);
        System.out.println(">>> front ctrl update params : " + content);
        System.out.println(">>>> front ctrl update params id :" + id);

        PostUpdateCtrl obj = (PostUpdateCtrl) factory.getCtrl(requestURL);
        return obj.update(title, content, id);
    }

    public Optional<List<PostResponseDTO>> search(String requestURL, String writer) {
        System.out.println(">>>> front ctrl search params writer :" + writer);

        PostSearchCtrl obj = (PostSearchCtrl) factory.getCtrl(requestURL);
        return obj.search(writer);
    }

    public boolean save(String requestURL) {
        System.out.println(">>>> front ctrl save : ");

        // PostSaveCtrl - save() - saveToFile() : TO 스트림을 이용한 데이터 저장
        PostSaveCtrl obj = (PostSaveCtrl) factory.getCtrl(requestURL);

        return obj.save();
    }
}
