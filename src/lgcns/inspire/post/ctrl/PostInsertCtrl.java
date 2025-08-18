package lgcns.inspire.post.ctrl;

public class PostInsertCtrl {
    public int insert(String title, String content, String writer) {
        System.out.println(">>>>> post insert ctrl insert params title : " + title);
        System.out.println(">>>>> post insert ctrl insert params content : " + content);
        System.out.println(">>>>> post insert ctrl insert params writer : " + writer);
        return 1;
    }
}
