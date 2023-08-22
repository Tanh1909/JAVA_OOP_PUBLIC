public class Response <D>{
    String messeger;
    D data;
    public Response(){

    }

    public Response(D data) {
        this.data = data;
    }

    public String getMesseger() {
        return messeger;
    }

    public void setMesseger(String messeger) {
        this.messeger = messeger;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public void sucess(Object data){
        this.messeger="Sucess";
        this.data= (D) data;
    }
    public void error(){
        this.messeger="ERROR";
    }
}
