import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> datas=new ArrayList<>();
        datas.add("tanhdz");
        datas.add("123");
        datas.add("java");

        Response<?> response=new Response<>();
        response.sucess(datas);
        System.out.println("message: "+response.getMesseger()+"\n"+"data: "+response.getData());

    }
}
