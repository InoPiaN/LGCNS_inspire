import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lgcns.inspire.post.domain.dto.PostResponseDTO;

public class IOStreamApp {
    public static void main(String[] args) {
        // System.out.println(">>>> stream 이용한 데이터 입력");
        // try {
        // int input = System.in.read();
        // System.out.println(">>>> result : " + (char) input);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        //////////////// char stream
        // System.out.println(">>>>> stream 이용한 데이터 입력 : ");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try {
        // String input = br.readLine();
        // System.out.println(">>>> result : " + input);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        System.out.println(">>>>> 파일에 데이터(문자열,객체, etc.... 저장하기 ");

        // 7 AutoCloseable
        // try(){}catch(){}

        String data = "IO 스트림을 이용한 파일 출력입니다.";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("./test.txt")))) {
            bw.write(data);
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        List<PostResponseDTO> posts = new ArrayList<>(Arrays.asList(
                PostResponseDTO.builder()
                        .id(1)
                        .title("mvc")
                        .content("springboot")
                        .writer("jslim").build(),
                PostResponseDTO.builder()
                        .id(2)
                        .title("stream api")
                        .content("기초문법")
                        .writer("lgcns").build(),
                PostResponseDTO.builder()
                        .id(3)
                        .title("lambda")
                        .content("함수형 인터페이스와 연동")
                        .writer("lgcns").build(),
                PostResponseDTO.builder()
                        .id(4)
                        .title("springboot")
                        .content("pattern 조합")
                        .writer("inspire").build()));
        System.out.println(">>>> 직렬화된 객체를 파일에 저장!!");

        // ObjectOutputStream -> FileOutputStream-> "text.txt"
        // oos.writeObject(posts);
        // ObjectInputStream <- FileInputStream <- "text.txt"
        // List<PostResponseDTO> posts = (List<PostResponseDTO>)ois.readObject()

        // try (ObjectOutputStream oos = new ObjectOutputStream(new
        // FileOutputStream("./text.txt"))) {
        // oos.writeObject(posts);
        // System.out.println(">>>> 직렬화된 객체 파일 저장 완료");
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

    }
}
