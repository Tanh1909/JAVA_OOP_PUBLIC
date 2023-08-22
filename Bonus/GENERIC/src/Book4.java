public class Book4<T> implements Writer<T>{
    @Override
    public void update(T obj) {
        System.out.println("updating...");
    }

    @Override
    public void delete(T obj) {
        System.out.println("deleting...");
    }

    @Override
    public void write(T obj) {
        System.out.println("writing " + obj);
    }

}
