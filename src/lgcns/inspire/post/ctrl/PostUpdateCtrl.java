package lgcns.inspire.post.ctrl;

public class PostUpdateCtrl {
    public int update(String title, String content, int id) {
        System.out.println(">>>>> post update ctrl update params title : " + title);
        System.out.println(">>>>> post update ctrl update params content : " + content);
        System.out.println(">>>>> post update ctrl update params id : " + id);
        return 1;
    }
}
