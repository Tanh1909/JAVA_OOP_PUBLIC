import java.util.ArrayList;

public class Store {

    public static <E> E getFirstElement(ArrayList<E> list){
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
